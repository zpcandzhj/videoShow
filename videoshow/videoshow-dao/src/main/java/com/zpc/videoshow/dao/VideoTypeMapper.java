package com.zpc.videoshow.dao;

import com.zpc.videoshow.pojo.VideoType;

import java.util.List;

public interface VideoTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(VideoType record);

    int insertSelective(VideoType record);

    List<VideoType> selectList(VideoType record);

    VideoType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(VideoType record);

    int updateByPrimaryKey(VideoType record);
}