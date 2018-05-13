<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>VideoShow后台管理系统</title>
</head>

<body>
<center>

    <h1>VideoShow在线视频网站后台管理系统</h1>
    <a href="addVideo">添加资源</a><hr/>
    <table style="BORDER-COLLAPSE: collapse; text-align: center;" borderColor=#000000 height=40 cellPadding=1
           width="70%" align="center" border=1>
        <thead>
        <tr>
            <th>封面图片</th>
            <th>视频名称</th>
            <th>视频类型</th>
            <th>预览视频</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${listVideoInfos}" var="p">
            <tr style="font-size: 18px">
                <td><img alt="" width="150px;" height="150px;" src="/videoshow/static/imgs/${p.videoCoverPath}"></td>
                <td>${p.videoName}</td>
                <td>${p.typeName}</td>
                <td><a href="videoDetails?id=${p.id}" style='text-decoration:none;'>预览视频</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <!--分页效果-->
    <a href="videoManage?pageIndex=1">首页</a>
    <c:forEach begin="1" end="${pageSize}" var="p">
        <a href="videoManage?pageIndex=${p}"> ${p}</a>
    </c:forEach>
    <a href="videoManage?pageIndex=${pageSize}">尾页</a>
</center>
</body>
</html>