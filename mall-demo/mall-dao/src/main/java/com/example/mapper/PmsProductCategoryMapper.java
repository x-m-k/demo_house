package com.example.mapper;

import com.example.model.PmsProductCategory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PmsProductCategoryMapper {
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
    int insert(PmsProductCategory record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(PmsProductCategory record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    PmsProductCategory selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(PmsProductCategory record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(PmsProductCategory record);


    //根据实体类pmsProductCategory的任意属性查询数据
    public List<PmsProductCategory> findByCondition(PmsProductCategory pmsProductCategory) throws JsonProcessingException;



}