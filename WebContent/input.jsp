<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:form action="emp-save">
		<s:textfield name="name" label="Name"></s:textfield>
		<s:password name="password" label="Password"></s:password>
		<s:radio list="#{'0':'Male','1':'Famle'}" name="gender" label="Gender"></s:radio>
		<s:select list="#request.department" listkey="departmentId" listvalue="departmentName"
			name="department" label="Department"></s:select>
		<s:checkboxlist list="#request.role" listkey="roleId" listvalue="roleName"
			name="role" label="Role"></s:checkboxlist>
		<s:textarea name="desc" label="Desc"></s:textarea>
		<s:submit></s:submit>
	</s:form>
</body>
</html>