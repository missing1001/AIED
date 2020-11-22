package com.psdcd.caaircraftservice.controller;

import com.alibaba.druid.util.StringUtils;
import com.psdcd.caaircraftservice.model.UserinfoTbl;
import com.psdcd.caaircraftservice.result.CodeStatus;
import com.psdcd.caaircraftservice.result.ResponseResult;
import com.psdcd.caaircraftservice.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;


    //注册
    @RequestMapping(value="/Register",method= RequestMethod.POST)
    public ResponseResult register(@RequestBody UserinfoTbl userinfoTbl) {
        String user_name = userinfoTbl.getUserName();
        String pass_word = userinfoTbl.getPassWord();
        Integer deviceRoot = userinfoTbl.getDeviceRoot();
        //非空校验参数
        if (!StringUtils.isEmpty(user_name) && !StringUtils.isEmpty(pass_word)) {
            if (loginService.isNullUser(user_name)){
                if (loginService.registerUser(userinfoTbl) == 1){
                    return new ResponseResult(CodeStatus.OK);
                }
                else {
                    return new ResponseResult(CodeStatus.FAIL);
                }
            }

        }
        return new ResponseResult(CodeStatus.FAIL);
    }

}
