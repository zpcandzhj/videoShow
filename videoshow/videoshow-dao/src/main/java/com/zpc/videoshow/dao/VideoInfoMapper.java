package com.zpc.videoshow.dao;

import com.zpc.videoshow.pojo.VideoInfo;

import java.util.List;

public interface VideoInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(VideoInfo record);

    int insertSelective(VideoInfo record);

    VideoInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(VideoInfo record);

    int updateByPrimaryKey(VideoInfo record);

    List<VideoInfo> selectAll();
}