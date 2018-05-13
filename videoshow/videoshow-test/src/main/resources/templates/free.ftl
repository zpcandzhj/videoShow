<h1>这是使用了freeMarker静态化了的页面</h1>
姓名：${name}<br/>
性别：<#if sex==1>男<#elseif sex==0>女<#else>
</#if>
<br/>
用户列表：
<#list userList as user>
    ${user}
</#list>