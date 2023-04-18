package com.example.service;

import com.example.model.PmsProduct;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PmsProductService {

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
    int insert(PmsProduct record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(PmsProduct record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    PmsProduct selectByPrimaryKey(Long id);

    /**
     * select by Condition
     * @param pmsProduct
     * @return
     */
    public PageInfo<PmsProduct> findByCondition(PmsProduct pmsProduct, Integer PageNum, Integer PageSize)throws JsonProcessingException;






    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    public int updateByPrimaryKeySelective(PmsProduct record, List<Long> ids,String vertifyMan) ;

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(PmsProduct record);
}
