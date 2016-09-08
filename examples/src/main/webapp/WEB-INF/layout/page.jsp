<%@taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="t" uri="http://tiles.apache.org/tags-tiles" %>
<%@page session="false" %>
<html>
<head>
    <title>tiles tmplate</title>
</head>
<body>
    <div id="header">
        <t:insertAttribute name="header"></t:insertAttribute>
    </div>

    <div id="body">
        <t:insertAttribute name="body"></t:insertAttribute>
    </div>

    <div id="footer">
        <t:insertAttribute name="footer"></t:insertAttribute>
    </div>
</body>
</html>
