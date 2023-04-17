package com.example.mapper;

import com.example.model.UmsMemberProductCategoryRelation;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UmsMemberProductCategoryRelationMapper {
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
    int insert(UmsMemberProductCategoryRelation record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(UmsMemberProductCategoryRelation record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    UmsMemberProductCategoryRelation selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(UmsMemberProductCategoryRelation record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(UmsMemberProductCategoryRelation record);
}