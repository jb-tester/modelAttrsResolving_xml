<%--
  Created by IntelliJ IDEA.
  User: Irina.Petrovskaya
  Date: 4/6/2016
  Time: 3:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>view1</title>
</head>
<p>
method-level attribute: ${view1_attr1}
<p/>
controller-level attribute: ${controller1ModelAttr}
<p/>
implicit model attributes from controller: ${string} and ${stringList[0]}
</p>
from different controller (should not be resolved): ${controller3ModelAttr}
<p/>
global-level model attributes: ${globalModelAttr1} and ${globalModelAttr2}
</body>
</html>
