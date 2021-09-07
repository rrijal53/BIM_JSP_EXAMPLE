This is an example of java beans for BIM 5th semester:

Syntax of jsp:useBean action tag
```
<jsp:useBean id= "instanceName" scope= "page | request | session | application"   
class= "packageName.className" type= "packageName.className"  
beanName="packageName.className | <%= expression >" >  
</jsp:useBean>  
```

Syntax of jsp:setProperty action tag
```
<jsp:setProperty name="instanceOfBean" property= "*"   |   
property="propertyName" param="parameterName"  |   
property="propertyName" value="{ string | <%= expression %>}"   
/>  
```
Syntax of jsp:getProperty action tag
```
<jsp:getProperty name="instanceOfBean" property="propertyName" />  
```
