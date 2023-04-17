package com.example.mapper;

import com.example.model.PmsSkuStock;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PmsSkuStockMapper {
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
    int insert(PmsSkuStock record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(PmsSkuStock record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    PmsSkuStock selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(PmsSkuStock record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(PmsSkuStock record);
}