package com.example.mapper;

import com.example.model.PmsProductAttributeValue;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PmsProductAttributeValueMapper {
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
    int insert(PmsProductAttributeValue record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(PmsProductAttributeValue record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    PmsProductAttributeValue selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(PmsProductAttributeValue record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(PmsProductAttributeValue record);
}