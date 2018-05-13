package com.zpc.videoshow.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zpc.videoshow.pojo.VideoInfo;
import com.zpc.videoshow.pojo.VideoType;
import com.zpc.videoshow.service.VideoInfoService;
import com.zpc.videoshow.service.VideoTypeService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.List;

@Controller
public class VideoInfoController {

    private static Logger log = Logger.getLogger(VideoInfoController.class);

    @Autowired
    private VideoInfoService videoInfoService;
    @Autowired
    private VideoTypeService videoTypeService;

    private static final String BASE_URL = "backstage/";
    // 视频管理页面
    private static final String VIDEOMANAG = BASE_URL + "videoManage";
    private static final String ADD_VIDEO = BASE_URL + "addVideo";
    private static final String VIDEO_DETAILS = BASE_URL + "videoDetails";

    /**
     * 视频网站首页，显示所有视频信息列表
     * @param request
     * @return
     */
    @RequestMapping("/videoManage")
    public String videoManage(HttpServletRequest request, Integer pageIndex) {
        //使用pageHelper实现分页查询
        if(null==pageIndex){
            pageIndex=1;
        }
        Page page = PageHelper.startPage(pageIndex, 3);
        List<VideoInfo> listVideoInfos = videoInfoService.getVideoInfos();
        request.setAttribute("listVideoInfos", listVideoInfos);
        request.setAttribute("pageSize", page.getPages());
        System.out.println("pageSize:"+page.getPages());
        return VIDEOMANAG;
    }

    /**
     * 添加视频页
     * @param request
     * @return
     */
    @RequestMapping("/addVideo")
    public String addVideo(HttpServletRequest request) {
        //查询视频类型，用于前端页面下拉框。null代表不设置条件,查询所有类型
        List<VideoType> listVideoTypes = videoTypeService.getVideoTypes(null);
        request.setAttribute("listVideoTypes", listVideoTypes);
        return "backstage/addVideo";
    }

    /**
     * 显示视频详情(播放页)
     * @param id
     * @param request
     * @return
     */
    @RequestMapping("/videoDetails")
    public String videoDetails(int id, HttpServletRequest request) {
        VideoInfo videoInfo = videoInfoService.getVideoInfo(id);
        request.setAttribute("videoInfo", videoInfo);
        return VIDEO_DETAILS;
    }

    /**
     * 上传视频信息
     * @param file
     * @param videoInfo
     * @param req
     * @param res
     * @return
     */
    @RequestMapping("/addVideoInfo")
    public String addVideo(@RequestParam(value = "file", required = false) MultipartFile file, VideoInfo videoInfo,
                           HttpServletRequest req, HttpServletResponse res) {
        try {
            // 获取当前上下文
            String path = req.getSession().getServletContext().getRealPath("/static/imgs");
            log.info("path:"+path);
            // 生成封面图片文件名称
            String fileName = System.currentTimeMillis() + ".png";
            File targetFile = new File(path, fileName);
            // 文件夹不存在,则创建文件夹
            if (!targetFile.getParentFile().exists()) {
                targetFile.mkdirs();
            }
            // 存储上传的封面文件
            try {
                file.transferTo(targetFile);
            } catch (Exception e) {
                log.error(e);
            }
            videoInfo.setVideoCoverPath(fileName);
            //添加视频信息至数据库表
            videoInfoService.addVideoInfo(videoInfo);
            req.setAttribute("result", "封面上传成功!");
            return "redirect:/videoManage";
        } catch (Exception e) {
            log.error(e);
            req.setAttribute("result", "封面上传失败!");
            return ADD_VIDEO;
        }
    }

    /**
     * 查询所有视频信息列表
     * @return
     */
    @ResponseBody
    @RequestMapping("/getVideoInfoList")
    public List<VideoInfo> getVideoInfoList() {
        return videoInfoService.getVideoInfos();
    }

}
