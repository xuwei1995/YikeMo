package com.serviceindeed.yike.yikemo.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.serviceindeed.yike.yikemo.domain.Student;
import com.serviceindeed.yike.yikemo.domain.TempClassify;
import com.serviceindeed.yike.yikemo.domain.TempPraxis;
import com.serviceindeed.yike.yikemo.domain.User;
import com.serviceindeed.yike.yikemo.domain.helper.HttpPages;
import com.serviceindeed.yike.yikemo.mapper.TempClassifyMapper;
import com.serviceindeed.yike.yikemo.mapper.TempPraxisMapper;
import com.serviceindeed.yike.yikemo.util.Constant;
import com.serviceindeed.yike.yikemo.util.MyException;
import com.serviceindeed.yike.yikemo.util.YiKeMoHelper;
import org.apache.commons.io.FileUtils;
import org.apache.tomcat.util.http.fileupload.FileItemFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.List;
import java.util.Map;

@Service
public class TempService {
    private Logger log = LoggerFactory.getLogger(this.getClass());
    @Value("${sgfFileUploadPath}")
    private String sgfFileUploadPath;
    @Autowired
    TempClassifyMapper tempClassifyMapper;
    @Autowired
    TempPraxisMapper tempPraxisMapper;

    @Transactional
    public Map getTempClassify() {
        List<TempClassify> tempClassifyList = tempClassifyMapper.getTempClassify();
        return YiKeMoHelper.getInstance().successJsonResultMap(tempClassifyList);

    }

    @Transactional
    public Map savePraxis(TempPraxis tempPraxis, User userToken, HttpHeaders headers) {

            MultipartFile sgfFile = tempPraxis.getSgfFile();
            String userAgent=YiKeMoHelper.getInstance().getHttpHeaderInfo(headers,HttpHeaders.USER_AGENT);
            if (tempPraxis.getPraxisId() == null) { //新增
                if (sgfFile == null) {
                    return YiKeMoHelper.getInstance().errorJsonResultMap(Constant.SERVER_MSG_011, "请上传sgf文件");
                }
                tempPraxis.setSgf(YiKeMoHelper.getInstance().generateFileName(sgfFile.getOriginalFilename(), "SGF"));
                tempPraxisMapper.insertSelective(tempPraxis);
                File destFile = new File(sgfFileUploadPath+tempPraxis.getSgf());
                // 检测是否存在目录
                if (!destFile.getParentFile().exists()) {
                    destFile.getParentFile().mkdirs();
                }
                try {
                    FileUtils.copyInputStreamToFile(sgfFile.getInputStream(), destFile);
                } catch (IOException e) {
                    throw    new MyException(Constant.SERVER_MSG_007);
                }
            return YiKeMoHelper.getInstance().successJsonResultMap(null, "新增成功");
            } else {  //修改
                if( tempPraxis.getSgfFile()!=null) //修改提交了sgf文件
                {
                  String sfgName= tempPraxisMapper.selectByPrimaryKey(tempPraxis.getPraxisId()).getSgf();

                    tempPraxis.setSgf(sfgName);
                    File destFile = new File(sgfFileUploadPath+tempPraxis.getSgf());
                    // 检测是否存在目录
                    if (!destFile.getParentFile().exists()) {
                        destFile.getParentFile().mkdirs();
                    }
                    try {
                        FileUtils.copyInputStreamToFile(sgfFile.getInputStream(), destFile);
                    } catch (IOException e) {
                        throw    new MyException(Constant.SERVER_MSG_007);
                    }
                }
                tempPraxisMapper.updateByPrimaryKeySelective(tempPraxis);

                return YiKeMoHelper.getInstance().successJsonResultMap(null, "操作成功");
            }
    }

    public Map getAllPraxis(HttpPages httpPages, TempPraxis tempPraxis) {
        if (YiKeMoHelper.getInstance().isPaging(httpPages)) {
            Page<TempPraxis> page = PageHelper.offsetPage(httpPages.getStart(), httpPages.getLength()).doSelectPage(() ->
                    tempPraxisMapper.getAllPraxis(tempPraxis));
            return YiKeMoHelper.getInstance().getSuccessPageQueryJson(httpPages.getDraw() + 1, page);
        } else {
            List<TempPraxis> tempPraxisList = tempPraxisMapper.getAllPraxis(tempPraxis);
            return YiKeMoHelper.getInstance().notPagingResult(tempPraxisList, tempPraxisList.size());
        }
    }

    public Map<String, Object> getSgfFileInfo(String sgfName) {
        File file = new File(sgfFileUploadPath + sgfName);
        // 检测是否存在目录
        if (!file.exists()) {
            return YiKeMoHelper.getInstance().errorJsonResultMap(Constant.SERVER_MSG_013, sgfName + "文件");
        }else {
            String sgfInfo=YiKeMoHelper.getInstance().readFile(file);
          return YiKeMoHelper.getInstance().successJsonResultMap(sgfInfo,"获取sgf信息成功");
        }
    }

}
