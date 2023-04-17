package com.example.mapper;

import com.example.model.PmsAlbum;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PmsAlbumMapper {
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
    int insert(PmsAlbum record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(PmsAlbum record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    PmsAlbum selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(PmsAlbum record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(PmsAlbum record);
}