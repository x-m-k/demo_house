package com.example.mapper;

import com.example.model.PmsProductFullReduction;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PmsProductFullReductionMapper {
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
    int insert(PmsProductFullReduction record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(PmsProductFullReduction record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    PmsProductFullReduction selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(PmsProductFullReduction record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(PmsProductFullReduction record);
}