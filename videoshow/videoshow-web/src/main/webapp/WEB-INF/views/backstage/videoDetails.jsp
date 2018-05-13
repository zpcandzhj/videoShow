<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>${videoInfo.videoName}视频详情</title>
</head>
<body>
<center>
    <h1>${videoInfo.videoName}</h1>
    <iframe height=600 width=600 src='${videoInfo.videoHtmlUrl}'
            frameborder=0'allowfullscreen'></iframe>
</center>

</body>
</html>