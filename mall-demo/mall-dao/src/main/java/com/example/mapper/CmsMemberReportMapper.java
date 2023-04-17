package com.example.mapper;

import com.example.model.CmsMemberReport;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CmsMemberReportMapper {
    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(CmsMemberReport record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(CmsMemberReport record);
}