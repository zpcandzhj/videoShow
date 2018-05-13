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
public class TestController {
    private static Logger log = Logger.getLogger(TestController.class);
    private static final String TEST = "test";
    @Autowired
    private VideoTypeService videoTypeService;

    @RequestMapping("/test")
    public String test() {
        return TEST;
    }

    @ResponseBody
    @RequestMapping("/getVideoTypes")
    public List<VideoType> getViideType() {
        log.info(log.getName() + " start");
        VideoType videoType=new VideoType();
        List<VideoType> listVideoType = videoTypeService.getVideoTypes(videoType);
        log.info(log.getName() + " end");
        return listVideoType;
    }
}