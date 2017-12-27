package com.serviceindeed.yike.yikemo.controller;

import com.serviceindeed.yike.yikemo.domain.User;
import com.serviceindeed.yike.yikemo.domain.helper.HttpPages;
import com.serviceindeed.yike.yikemo.service.UserService;
import com.serviceindeed.yike.yikemo.service.StudentService;
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
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("auth/user")
public class UserController {

 @Autowired
 UserService userService;
 @Autowired
 StudentService studentService;
 private Logger log = LoggerFactory.getLogger(this.getClass());

 @RequestMapping("/getAllUsers")
 @ResponseBody
 public Map   getAllUsers(HttpPages httpPages,User user)
 {
  try {
   return  userService.getAllUsers(httpPages,user);
  }catch (Exception e)
  {
   log.error(e.getMessage(),e);
   return  YiKeMoHelper.getInstance().errorJsonResultMap(Constant.SERVER_MSG_001);
  }

 }
 @RequestMapping("/addUser")
 @ResponseBody
 public Map addUser(@RequestHeader HttpHeaders headers,@AuthenticationPrincipal User userToken, User user)
{
 try {
  return  studentService.addUser(headers,userToken,user);
 }
 catch (MyException e)
 {
  log.error(e.getMessage(),e);
  return YiKeMoHelper.getInstance().errorJsonResultMap(e.getMessage());
 }
 catch (Exception e)
 {
  TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();//try中需要手动回滚
  log.error(e.getMessage(),e);
  return  YiKeMoHelper.getInstance().serverExceptionMap;
 }
}
 @RequestMapping("/editUser")
 @ResponseBody
 public Map editUser(@RequestHeader HttpHeaders headers,@AuthenticationPrincipal User userToken, User user)
 {
  try{
    return  studentService.editUser(headers,userToken,user);
  }catch (MyException e)
  {
   log.error(e.getMessage(),e);
   return YiKeMoHelper.getInstance().errorJsonResultMap(e.getMessage());
  }
  catch (Exception e)
  {
   log.error(e.getMessage(),e);
   return YiKeMoHelper.getInstance().serverExceptionMap;
  }

 }
}
