package com.serviceindeed.yike.yikemo.service;

import com.serviceindeed.yike.yikemo.domain.Function;
import com.serviceindeed.yike.yikemo.domain.RoleFunction;
import com.serviceindeed.yike.yikemo.domain.UserFunction;
import com.serviceindeed.yike.yikemo.mapper.FunctionMapper;
import com.serviceindeed.yike.yikemo.mapper.RoleFunctionMapper;
import com.serviceindeed.yike.yikemo.mapper.UserFunctionMapper;
import com.serviceindeed.yike.yikemo.util.YiKeMoHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class FunctionService {
    @Autowired
    FunctionMapper functionMapper;
    @Autowired
    RoleFunctionMapper roleFunctionMapper;
    @Autowired
    UserFunctionMapper userFunctionMapper;

    public Map getAllFunctions() {
         List<Function> functionList= functionMapper.getAllFunctions();
        return YiKeMoHelper.getInstance().notPagingResult(functionList,functionList.size());
    }

    public Map getFunctionsByRoleId(Long roleId) {
        List<RoleFunction> roleFunctionList= roleFunctionMapper.getFunctionsByRoleId(roleId);
        return YiKeMoHelper.getInstance().notPagingResult(roleFunctionList,roleFunctionList.size());
    }

    public Map getFunctionsByUserId(Long userId) {
        List<UserFunction> userFunctionList= userFunctionMapper.getFunctionsByUserId(userId);
        return YiKeMoHelper.getInstance().notPagingResult(userFunctionList,userFunctionList.size());
    }
}
