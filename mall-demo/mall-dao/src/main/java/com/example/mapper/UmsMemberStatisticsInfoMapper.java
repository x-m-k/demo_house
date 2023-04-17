package com.example.mapper;

import com.example.model.UmsMemberStatisticsInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UmsMemberStatisticsInfoMapper {
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
    int insert(UmsMemberStatisticsInfo record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(UmsMemberStatisticsInfo record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    UmsMemberStatisticsInfo selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(UmsMemberStatisticsInfo record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(UmsMemberStatisticsInfo record);
}