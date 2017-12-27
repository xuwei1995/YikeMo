package com.serviceindeed.yike.yikemo.controller;
import com.serviceindeed.yike.yikemo.domain.KnowledgePoint;
import com.serviceindeed.yike.yikemo.domain.User;
import com.serviceindeed.yike.yikemo.domain.helper.HttpPages;
import com.serviceindeed.yike.yikemo.service.KnowledgeService;
import com.serviceindeed.yike.yikemo.util.Constant;
import com.serviceindeed.yike.yikemo.util.YiKeMoHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.serviceindeed.yike.yikemo.util.Constant;
import com.serviceindeed.yike.yikemo.util.YiKeMoHelper;
import org.apache.poi.ss.formula.functions.T;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping("auth/knowledge")
public class KnowledgeController {
    @Autowired
    KnowledgeService knowledgeService;
    private Logger log = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/getAllKnowledgePoints")
    @ResponseBody
    public Map getAllKnowledgePoints(KnowledgePoint knowledgePoint, HttpPages httpPages) {
        try {
            return knowledgeService.getAllKnowledgePoints(httpPages, knowledgePoint);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return YiKeMoHelper.getInstance().errorJsonResultMap(Constant.SERVER_MSG_001);
        }
    }

    /**
     * 新增知识点信息
     *
     * @param knowledgePoint
     * @return
     */
    @RequestMapping("/addKnowledgePoint")
    @ResponseBody
    public Map addKnowledgePoint(@RequestHeader HttpHeaders headers, @AuthenticationPrincipal User userToken, KnowledgePoint knowledgePoint) {
        try {
            //设置基础信息
            YiKeMoHelper.getInstance().createHelper(knowledgePoint,userToken.getUserId(),"",
                    YiKeMoHelper.getInstance().getHttpHeaderInfo(headers, headers.USER_AGENT),"");
            knowledgeService.saveKnowledgePoint(knowledgePoint);
            return YiKeMoHelper.getInstance().successJsonResultMap(null);
        } catch (Exception e) {
            log.error(" addKnowledgePoints:新增知识点失败:", e);
            e.printStackTrace();
            return YiKeMoHelper.getInstance().errorJsonResultMap(Constant.SERVER_MSG_001);
        }
    }

    /**
     * 编辑知识点信息
     *
     * @param knowledgePoint
     * @return
     */
    @RequestMapping("/editKnowledgePoint")
    @ResponseBody
    public Map editKnowledgePoints(@AuthenticationPrincipal User userToken, @RequestHeader HttpHeaders headers, KnowledgePoint knowledgePoint) {
        try {
            //设置基础信息
            YiKeMoHelper.getInstance().updateHelper(knowledgePoint,userToken.getUserId(),"",
                    YiKeMoHelper.getInstance().getHttpHeaderInfo(headers, headers.USER_AGENT),"");
            knowledgeService.updateKnowledgePoint(knowledgePoint);
            return YiKeMoHelper.getInstance().successJsonResultMap(null);
        } catch (Exception e) {
            log.error("editKnowledgePoints--知识点修改失败:", e);
            return YiKeMoHelper.getInstance().errorJsonResultMap(Constant.SERVER_MSG_001);
        }
    }
}
