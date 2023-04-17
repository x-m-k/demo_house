package com.example.mapper;

import com.example.model.OmsOrderOperateHistory;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OmsOrderOperateHistoryMapper {
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
    int insert(OmsOrderOperateHistory record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(OmsOrderOperateHistory record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    OmsOrderOperateHistory selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(OmsOrderOperateHistory record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(OmsOrderOperateHistory record);
}