package com.serviceindeed.yike.yikemo.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.serviceindeed.yike.yikemo.domain.KnowledgePoint;
import com.serviceindeed.yike.yikemo.domain.helper.HttpPages;
import com.serviceindeed.yike.yikemo.mapper.KnowledgePointMapper;
import com.serviceindeed.yike.yikemo.util.Constant;
import com.serviceindeed.yike.yikemo.util.YiKeMoHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class KnowledgeService {
    @Autowired
    KnowledgePointMapper knowledgePointMapper;
    private Logger log = LoggerFactory.getLogger(this.getClass());

    public Map<String ,Object> getAllKnowledgePoints(HttpPages httpPages,KnowledgePoint knowledgePoint) {
        if(YiKeMoHelper.getInstance().isPaging(httpPages))//分页不分页
        {
            Page<KnowledgePoint> pages= PageHelper.offsetPage(httpPages.getStart(),httpPages.getLength()).doSelectPage(
                    ()->knowledgePointMapper.getAllKnowledgePoints(knowledgePoint));
            return  YiKeMoHelper.getInstance().getSuccessPageQueryJson(httpPages.getDraw()+1,pages);

        }else {
            List<KnowledgePoint> knowledgePointList=  knowledgePointMapper.getAllKnowledgePoints(knowledgePoint);
            return  YiKeMoHelper.getInstance().notPagingResult(knowledgePointList,knowledgePointList.size());
        }
    }
    /**
     * 根据知识体系ID查询知识体系信息
     * @param knowledgePointId
     * @return
     */
    public KnowledgePoint queryKnowledgePointById(Long knowledgePointId){
        return knowledgePointMapper.selectByPrimaryKey(knowledgePointId);
    }
    /**
     * 保存知识点信息
     * @param knowledgePoint
     */
    @Transactional
    public void saveKnowledgePoint(KnowledgePoint knowledgePoint) {
        knowledgePointMapper.insert(knowledgePoint);
    }
    /**
     *修改知识点信息
     * @param knowledgePoint
     */
    @Transactional
    public void updateKnowledgePoint(KnowledgePoint knowledgePoint){
        KnowledgePoint knowledgePointEdit= this.queryKnowledgePointById(knowledgePoint.getKnowledgePointId());
        BeanUtils.copyProperties(knowledgePoint,knowledgePointEdit,new String[]{"createBy","createDate","createPlatform","createVersion"});
        knowledgePointMapper.updateByPrimaryKey(knowledgePointEdit);
    }
}
