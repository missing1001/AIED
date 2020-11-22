package com.psdcd.caaircraftservice.service;
import com.psdcd.caaircraftservice.mapper.UserinfoTblMapper;
import com.psdcd.caaircraftservice.model.UserinfoTbl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LoginService {

    @Autowired
    UserinfoTblMapper userinfoTblMapper;

    public int registerUser(UserinfoTbl registerVo) {
        return userinfoTblMapper.insert(registerVo);
    }

    public boolean isNullUser(String user_name) {


        UserinfoTbl a = userinfoTblMapper.selectByUserName(user_name);
        if (1==1){
            return true;

        }
        else {
            return false;
        }
    }
}
