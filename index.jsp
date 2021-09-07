<jsp:useBean id="obj" class="com.rowsun.Student"/>

<%
String m=obj.addNumber(5, 10);
out.print(m);
%>