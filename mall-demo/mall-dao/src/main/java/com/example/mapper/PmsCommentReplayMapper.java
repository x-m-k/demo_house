package com.example.mapper;

import com.example.model.PmsCommentReplay;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PmsCommentReplayMapper {
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
    int insert(PmsCommentReplay record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(PmsCommentReplay record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    PmsCommentReplay selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(PmsCommentReplay record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(PmsCommentReplay record);
}