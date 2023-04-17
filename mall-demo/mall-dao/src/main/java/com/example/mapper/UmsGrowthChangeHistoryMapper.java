package com.example.mapper;

import com.example.model.UmsGrowthChangeHistory;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UmsGrowthChangeHistoryMapper {
    /**
     * delete by primary key
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Long id);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(UmsGrowthChangeHistory record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(UmsGrowthChangeHistory record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    UmsGrowthChangeHistory selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(UmsGrowthChangeHistory record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(UmsGrowthChangeHistory record);
}