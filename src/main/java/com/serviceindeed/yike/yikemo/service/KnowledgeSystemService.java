package com.serviceindeed.yike.yikemo.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.serviceindeed.yike.yikemo.domain.KnowledgeSystem;
import com.serviceindeed.yike.yikemo.domain.helper.HttpPages;
import com.serviceindeed.yike.yikemo.mapper.KnowledgeSystemMapper;
import com.serviceindeed.yike.yikemo.util.YiKeMoHelper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class KnowledgeSystemService {

    @Autowired
    KnowledgeSystemMapper knowledgeSystemMapper;

    /**
     * 查询知识体系
     *
     * @param httpPages
     * @param knowledgeSystem
     * @return
     */
    public Map<String, Object> getAllKnowledgeSystem(HttpPages httpPages, KnowledgeSystem knowledgeSystem) {
        //判断是否分页
        //分页
        if (YiKeMoHelper.getInstance().isPaging(httpPages)) {
            Page<KnowledgeSystem> pages = PageHelper.offsetPage(httpPages.getStart(), httpPages.getLength()).doSelectPage(
                    () -> knowledgeSystemMapper.queryKnowledgeSystemList(knowledgeSystem));
            return YiKeMoHelper.getInstance().getSuccessPageQueryJson(httpPages.getDraw() + 1, pages);

        }
        //不分页
        else {
            List<KnowledgeSystem> knowledgePointList = knowledgeSystemMapper.queryKnowledgeSystemList(knowledgeSystem);
            return YiKeMoHelper.getInstance().notPagingResult(knowledgePointList, knowledgePointList.size());
        }
    }

    /**
     * 根据知识体系ID查询知识体系信息
     *
     * @param knowledgeSystemId
     * @return
     */
    public KnowledgeSystem queryKnowledgeSystemById(Long knowledgeSystemId) {
        return knowledgeSystemMapper.selectByPrimaryKey(knowledgeSystemId);
    }

    /**
     * 修改知识体系信息
     *
     * @param knowledgeSystem
     */
    @Transactional
    public void updateKnowledgeSystem(KnowledgeSystem knowledgeSystem) {
        KnowledgeSystem knowledgeSystemEdit = this.queryKnowledgeSystemById(knowledgeSystem.getKnowledgeSystemId());
        BeanUtils.copyProperties(knowledgeSystem, knowledgeSystemEdit, new String[]{"createBy", "createDate", "createPlatform", "createVersion"});
        knowledgeSystemMapper.updateByPrimaryKey(knowledgeSystemEdit);
    }

    /**
     * 保存知识体系信息
     *
     * @param knowledgeSystem
     */
    @Transactional
    public void saveKnowledgeSystem(KnowledgeSystem knowledgeSystem) {
        knowledgeSystemMapper.insert(knowledgeSystem);
    }
}
