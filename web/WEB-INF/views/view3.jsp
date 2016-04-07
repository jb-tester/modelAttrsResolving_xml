<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>view3</title>
</head>
<body>
method-level attribute: ${view3_attr1}
<p/>
controller-level attribute: ${controller2ModelAttr}
<p/>
implicit model attributes from controller: ${string} and ${stringList[0]}
</p>
from different controller (should not be resolved): ${controller3ModelAttr}
<p/>
global-level model attributes: ${globalModelAttr1} and ${globalModelAttr2}
</body>
</html>