package com.example.mapper;

import com.example.model.SmsCoupon;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SmsCouponMapper {
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
    int insert(SmsCoupon record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(SmsCoupon record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    SmsCoupon selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(SmsCoupon record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(SmsCoupon record);
}