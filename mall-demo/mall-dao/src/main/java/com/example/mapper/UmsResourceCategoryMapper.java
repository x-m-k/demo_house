package com.example.mapper;

import com.example.model.UmsResourceCategory;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UmsResourceCategoryMapper {
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
    int insert(UmsResourceCategory record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(UmsResourceCategory record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    UmsResourceCategory selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(UmsResourceCategory record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(UmsResourceCategory record);
}