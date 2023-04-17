package com.example.mapper;

import com.example.model.UmsMemberRuleSetting;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UmsMemberRuleSettingMapper {
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
    int insert(UmsMemberRuleSetting record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(UmsMemberRuleSetting record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    UmsMemberRuleSetting selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(UmsMemberRuleSetting record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(UmsMemberRuleSetting record);
}