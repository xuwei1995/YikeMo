package com.serviceindeed.yike.yikemo.controller;

import com.serviceindeed.yike.yikemo.domain.TempPraxis;
import com.serviceindeed.yike.yikemo.domain.User;
import com.serviceindeed.yike.yikemo.domain.helper.HttpPages;
import com.serviceindeed.yike.yikemo.service.TempService;
import com.serviceindeed.yike.yikemo.util.Constant;
import com.serviceindeed.yike.yikemo.util.MyException;
import com.serviceindeed.yike.yikemo.util.YiKeMoHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.Map;

@Controller
@RequestMapping("auth/temp")
public class TempController {
    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    TempService tempService;
    @RequestMapping("/getTempClassify")
    @ResponseBody
    public Map getTempClassify(){
        try {
            return tempService.getTempClassify();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return YiKeMoHelper.getInstance().errorJsonResultMap(Constant.SERVER_MSG_001);
        }
    }
    @RequestMapping("/savePraxis")
    @ResponseBody
    public Map savePraxis(@RequestHeader HttpHeaders headers, TempPraxis tempPraxis, @AuthenticationPrincipal User userToken){
        try {
            return tempService.savePraxis(tempPraxis,userToken,headers);
        }
        catch (MyException e)
        {
            log.error(e.getMessage() ,e);
            return YiKeMoHelper.getInstance().errorJsonResultMap(Constant.SERVER_MSG_007,"文件");
        }
        catch (Exception e) {
            log.error(e.getMessage(), e);
            return YiKeMoHelper.getInstance().errorJsonResultMap(Constant.SERVER_MSG_001);
        }
    }
    @RequestMapping("/getAllPraxis")
    @ResponseBody
    public Map getAllPraxis(HttpPages httpPages,TempPraxis tempPraxis){
        try {
            return tempService.getAllPraxis(httpPages,tempPraxis);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return YiKeMoHelper.getInstance().errorJsonResultMap(Constant.SERVER_MSG_001);
        }
    }
    @RequestMapping("/getSgfFileInfo")
    @ResponseBody
    public Map<String,Object> getSgfFileInfo(@RequestParam("sgfName")String sgfName){
        try {
            return tempService.getSgfFileInfo(sgfName);
        }catch (MyException e)
        {
           log.error(e.getMessage(),e);
           return YiKeMoHelper.getInstance().errorJsonResultMap(e.getMessage());
        }catch (Exception e)
        {
            log.error(e.getMessage(),e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return YiKeMoHelper.getInstance().errorJsonResultMap(Constant.SERVER_MSG_001);
        }

    }
}
