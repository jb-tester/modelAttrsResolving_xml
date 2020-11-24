<%--
  Created by IntelliJ IDEA.
  User: Irina.Petrovskaya
  Date: 4/7/2016
  Time: 3:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>view5</title>
</head>
<body>
 implicit model attributes: ${numberList} and ${dateList}
 <p/>
 model attribute from flash: ${flashAttr.barStr}
<p/>
session attributes: ${sessionAttr1}, ${sessionAttr2}, ${sessionAttr3}, ${booSessionAttr1.booStr}, ${booSessionAttr2.booStr}
 <p/>
check parameters with implicit annotation values: ${boo.booStr}, ${foo.fooStr}
</body>
</html>
