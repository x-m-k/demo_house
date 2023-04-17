package com.example.mapper;

import com.example.model.PmsProductLadder;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PmsProductLadderMapper {
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
    int insert(PmsProductLadder record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(PmsProductLadder record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    PmsProductLadder selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(PmsProductLadder record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(PmsProductLadder record);
}