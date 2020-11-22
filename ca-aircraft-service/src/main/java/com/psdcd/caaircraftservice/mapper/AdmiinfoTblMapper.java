package com.psdcd.caaircraftservice.mapper;

import com.psdcd.caaircraftservice.model.AdmiinfoTbl;
import com.psdcd.caaircraftservice.model.AdmiinfoTblExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AdmiinfoTblMapper {
    int countByExample(AdmiinfoTblExample example);

    int deleteByExample(AdmiinfoTblExample example);

    int deleteByPrimaryKey(Integer admiId);

    int insert(AdmiinfoTbl record);

    int insertSelective(AdmiinfoTbl record);

    List<AdmiinfoTbl> selectByExample(AdmiinfoTblExample example);

    AdmiinfoTbl selectByPrimaryKey(Integer admiId);

    int updateByExampleSelective(@Param("record") AdmiinfoTbl record, @Param("example") AdmiinfoTblExample example);

    int updateByExample(@Param("record") AdmiinfoTbl record, @Param("example") AdmiinfoTblExample example);

    int updateByPrimaryKeySelective(AdmiinfoTbl record);

    int updateByPrimaryKey(AdmiinfoTbl record);
}