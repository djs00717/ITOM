<%--
  Created by IntelliJ IDEA.
  User: djs
  Date: 2017/11/9
  Time: 17:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div id="condition">
    <div >
        <label for="startDate" class="mr10" >开始日期：</label>
        <input id="startDate" data-options="editable:false" value="${startDate }" class="easyui-datebox" /> <label for="">至:</label>
        <input id="endDate" data-options="editable:false" type="text"  value="${endDate }" class="easyui-datebox" size="50" />

    </div>
</div>

</body>
</html>
