<%--
  Created by IntelliJ IDEA.
  User: Irina.Petrovskaya
  Date: 4/11/2016
  Time: 4:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>view8</title>
</head>
<body>
model attributes: ${view8attr1}, ${view8attr2}
<p/>
model attribute added using @ModelAttribute annotation - should not be resolved: ${controller5Attr1}
<p/>
global-level model attributes: ${globalModelAttr1} and ${globalModelAttr2}
</body>
</html>
