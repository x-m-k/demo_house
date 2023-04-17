package com.example.mapper;

import com.example.model.PmsAlbumPic;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PmsAlbumPicMapper {
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
    int insert(PmsAlbumPic record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(PmsAlbumPic record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    PmsAlbumPic selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(PmsAlbumPic record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(PmsAlbumPic record);
}