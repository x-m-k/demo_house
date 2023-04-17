package com.example.mapper;

import com.example.model.OmsOrderReturnReason;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OmsOrderReturnReasonMapper {
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
    int insert(OmsOrderReturnReason record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(OmsOrderReturnReason record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    OmsOrderReturnReason selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(OmsOrderReturnReason record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(OmsOrderReturnReason record);
}