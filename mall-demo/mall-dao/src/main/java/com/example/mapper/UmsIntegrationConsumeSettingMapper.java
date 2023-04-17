package com.example.mapper;

import com.example.model.UmsIntegrationConsumeSetting;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UmsIntegrationConsumeSettingMapper {
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
    int insert(UmsIntegrationConsumeSetting record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(UmsIntegrationConsumeSetting record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    UmsIntegrationConsumeSetting selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(UmsIntegrationConsumeSetting record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(UmsIntegrationConsumeSetting record);
}