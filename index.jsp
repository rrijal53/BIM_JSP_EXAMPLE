<jsp:useBean id="obj" class="com.rowsun.Student"/>

<%
String m = obj.addNumber(5, 130);
out.print(m);
%>

<%
    String name="roshan";
    String address="dhulikhel";
%>
<jsp:setProperty property="name" name="obj" value="<%=name %>"/>
<jsp:setProperty property="address" name="obj" value="<%=address %>"/>

Record:<br>
<jsp:getProperty property="name" name="obj"/><br>
<jsp:getProperty property="address" name="obj"/><br>