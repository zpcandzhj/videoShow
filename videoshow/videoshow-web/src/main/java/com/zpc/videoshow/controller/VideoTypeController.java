package com.zpc.videoshow.controller;

import com.zpc.videoshow.pojo.VideoType;
import com.zpc.videoshow.service.VideoTypeService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class VideoTypeController {
    private static Logger log = Logger.getLogger(VideoInfoController.class);

    @Autowired
    private VideoTypeService videoTypeService;

    @ResponseBody
    @RequestMapping("/getVideoTypeList")
    public List<VideoType> getVideoTypeList() {
        return videoTypeService.getVideoTypes(null);
    }
}
