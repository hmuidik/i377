<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Add</title>
</head>
<style type="text/css">
<!--
@import url("style.css");
-->
</style>
<body>
  <%@ include file="menu.jsp" %>
  <form method="post" action="Add">
    <table class="formTable" id="formTable">
      <tbody>
        <tr>
          <td>Nimi:</td>
          <td><input name="name" id="nameBox" /></td>
        </tr>
        <tr>
          <td>Kood:</td>
          <td><input name="code" id="codeBox"/></td>
        </tr>
        <tr>
          <td colspan="2" align="right"><br/>
            <input type="submit" value="Lisa" id="addButton"/>
          </td>
        </tr>
      </tbody>
    </table>
  </form>
</body>
</html>