package com.zpc.videoshow.generated;

import com.zpc.videoshow.generated.VideoInfo;

public interface VideoInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(VideoInfo record);

    int insertSelective(VideoInfo record);

    VideoInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(VideoInfo record);

    int updateByPrimaryKey(VideoInfo record);
}