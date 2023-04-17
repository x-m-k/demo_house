package com.example.mapper;

import com.example.model.SmsCouponProductRelation;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SmsCouponProductRelationMapper {
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
    int insert(SmsCouponProductRelation record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(SmsCouponProductRelation record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    SmsCouponProductRelation selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(SmsCouponProductRelation record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(SmsCouponProductRelation record);
}