package com.example.mapper;

import com.example.model.SmsHomeBrand;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SmsHomeBrandMapper {
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
    int insert(SmsHomeBrand record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(SmsHomeBrand record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    SmsHomeBrand selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(SmsHomeBrand record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(SmsHomeBrand record);
}