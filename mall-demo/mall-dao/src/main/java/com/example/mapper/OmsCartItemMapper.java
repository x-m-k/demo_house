package com.example.mapper;

import com.example.model.OmsCartItem;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OmsCartItemMapper {
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
    int insert(OmsCartItem record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(OmsCartItem record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    OmsCartItem selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(OmsCartItem record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(OmsCartItem record);
}