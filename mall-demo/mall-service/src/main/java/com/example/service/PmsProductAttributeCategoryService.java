package com.example.service;

import com.example.model.PmsProductAttributeCategory;
import com.github.pagehelper.PageInfo;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PmsProductAttributeCategoryService {
    /**
     * delete by primary key
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 批量删除 by ids
     * @param ids
     * @return
     */
    int delete_batch(List<Long> ids);
    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */

    int insert(PmsProductAttributeCategory record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(PmsProductAttributeCategory record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    PmsProductAttributeCategory selectByPrimaryKey(Long id);

    /**
     * select by 实体类属性
     * @param pmsProductAttributeCategory
     * @return
     */
    PageInfo<PmsProductAttributeCategory> findByCondition(PmsProductAttributeCategory pmsProductAttributeCategory,Integer PageNum,Integer PageSize);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(PmsProductAttributeCategory record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(PmsProductAttributeCategory record);
}
