package com.example.mapper;

import com.example.model.PmsProductAttributeCategory;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PmsProductAttributeCategoryMapper {
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
    int insert(PmsProductAttributeCategory record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(PmsProductAttributeCategory record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    PmsProductAttributeCategory selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(PmsProductAttributeCategory record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(PmsProductAttributeCategory record);
}