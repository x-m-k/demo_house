package com.example.mapper;

import com.example.model.PmsProductVertifyRecord;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PmsProductVertifyRecordMapper {
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
    int insert(PmsProductVertifyRecord record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(PmsProductVertifyRecord record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    PmsProductVertifyRecord selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(PmsProductVertifyRecord record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(PmsProductVertifyRecord record);
}