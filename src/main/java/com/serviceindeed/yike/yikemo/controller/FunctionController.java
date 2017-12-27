package com.serviceindeed.yike.yikemo.controller;

import com.serviceindeed.yike.yikemo.domain.Function;
import com.serviceindeed.yike.yikemo.service.FunctionService;
import com.serviceindeed.yike.yikemo.util.Constant;
import com.serviceindeed.yike.yikemo.util.YiKeMoHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("auth/function")
public class FunctionController {
    Logger log= LoggerFactory.getLogger(this.getClass());
    @Autowired
    FunctionService functionService;

    @RequestMapping("/getAllFunctions")
    @ResponseBody
    public Map getAllFunctions(){
    return functionService.getAllFunctions();
    }

    @RequestMapping("/getFunctionsByRoleId")
    @ResponseBody
    public Map getFunctionsByRoleId(@RequestParam("roleId") Long roleId){
        return functionService.getFunctionsByRoleId(roleId);
    }

    @RequestMapping("/getFunctionsByUserId")
    @ResponseBody
    public Map getFunctionsByUserId(@RequestParam("userId") Long userId){
        try {
            return functionService.getFunctionsByUserId(userId);

        }catch (Exception e)
        {
            log.error(e.getMessage(),e);
            return YiKeMoHelper.getInstance().errorJsonResultMap(Constant.SERVER_MSG_001);
        }
    }
}
