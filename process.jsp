<jsp:useBean id="s" class="com.rowsun.Student" />
<jsp:setProperty property="*" name="s"/>

Record:<br>
<jsp:getProperty property="name" name="s"/><br>
<jsp:getProperty property="address" name="s" /><br>
