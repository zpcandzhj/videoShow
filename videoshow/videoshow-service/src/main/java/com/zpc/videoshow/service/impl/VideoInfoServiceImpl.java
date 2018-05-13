package com.zpc.videoshow.service.impl;

import com.zpc.videoshow.dao.VideoInfoMapper;
import com.zpc.videoshow.pojo.VideoInfo;
import com.zpc.videoshow.service.VideoInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoInfoServiceImpl implements VideoInfoService {

    @Autowired
    private VideoInfoMapper videoInfoMapper;

    @Override
    public List<VideoInfo> getVideoInfos() {
        return videoInfoMapper.selectAll();
    }

    @Override
    public int addVideoInfo(VideoInfo record) {
        return videoInfoMapper.insert(record);

    }

    @Override
    public VideoInfo getVideoInfo(int id) {
        return videoInfoMapper.selectByPrimaryKey(id);

    }

}
