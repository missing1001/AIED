package com.psdcd.caaircraftservice.mapper;

import com.psdcd.caaircraftservice.model.UserinfoTbl;
import com.psdcd.caaircraftservice.model.UserinfoTblExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserinfoTblMapper {
    int countByExample(UserinfoTblExample example);

    int deleteByExample(UserinfoTblExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(UserinfoTbl record);

    int insertSelective(UserinfoTbl record);

    List<UserinfoTbl> selectByExample(UserinfoTblExample example);

    UserinfoTbl selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") UserinfoTbl record, @Param("example") UserinfoTblExample example);

    int updateByExample(@Param("record") UserinfoTbl record, @Param("example") UserinfoTblExample example);

    int updateByPrimaryKeySelective(UserinfoTbl record);

    int updateByPrimaryKey(UserinfoTbl record);


    UserinfoTbl selectByUserName(String user_name);
}