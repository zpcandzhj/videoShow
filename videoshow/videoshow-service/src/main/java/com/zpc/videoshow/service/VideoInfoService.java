package com.zpc.videoshow.service;

import com.zpc.videoshow.pojo.VideoInfo;

import java.util.List;

public interface VideoInfoService {

    public List<VideoInfo> getVideoInfos();

    public int addVideoInfo(VideoInfo record);

    public VideoInfo getVideoInfo(int id);

}
