<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>添加视频资源</title>
</head>
<body>
<center>
    <h1>VideoShow网站后台添加视频资源</h1>
    <form action="addVideoInfo" style="font-size: 14px;" method="post"
          ENCTYPE="multipart/form-data">
        <table>
            <tr>
                <td>视频名称:</td>
                <td><input type="text" name="videoName"></td>
            </tr>
            <tr>
                <td>视频类型:</td>
                <td>
                    <select name="videoType" style="width: 170px;">
                    <c:forEach items="${listVideoTypes}" var="p">
                        <option value="${p.id}">${p.typeName}</option>
                    </c:forEach>
                 </select>
                </td>
            </tr>
            <tr>
                <td>在线播放URL:</td>
                <td><textarea rows="10" cols="30" name="videoHtmlUrl"></textarea></td>
            </tr>
            <tr>
                <td>上传封面:</td>
                <td><input type="file" name="file"></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="提交"></td>
            </tr>
        </table>
    </form>
</center>
</body>
</html>