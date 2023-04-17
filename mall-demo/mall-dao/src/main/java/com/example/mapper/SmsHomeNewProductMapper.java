package com.example.mapper;

import com.example.model.SmsHomeNewProduct;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SmsHomeNewProductMapper {
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
    int insert(SmsHomeNewProduct record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(SmsHomeNewProduct record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    SmsHomeNewProduct selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(SmsHomeNewProduct record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(SmsHomeNewProduct record);
}