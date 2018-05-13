package com.zpc.videoshow.service.impl;

import com.zpc.videoshow.dao.VideoTypeMapper;
import com.zpc.videoshow.pojo.VideoType;
import com.zpc.videoshow.service.VideoTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoTypeServiceImpl implements VideoTypeService {

    @Autowired
    private VideoTypeMapper videoTypeMapper;

    @Override
    public List<VideoType> getVideoTypes(VideoType record) {
        return videoTypeMapper.selectList(record);
    }
}