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
controller-level attribute: ${controller1ModelAttr1}
<p/>
controller-level attribute: ${controller1ModelAttr2}
<p/>
controller-level attribute: ${controller1ModelAttr2_extra}
<p/>
controller-level attribute: ${controller1ModelAttr3_extra}
<p/>
implicit model attributes from controller: ${string}, ${stringList[0]}, ${fooList[0].fooStr}, ${hashMap.get("foo1").fooStr}, ${linkedHashMap.get("mapkey1")}
</p>
from different controller (should not be resolved): ${controller3ModelAttr}
<p/>
global-level model attributes: ${globalModelAttr1} and ${globalModelAttr2}
</body>
</html>
