<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Search</title>
</head>
<style type="text/css">
<!--
@import url("style.css");
-->
</style>
<body>
<%@ include file="menu.jsp" %>
 <form method="get" action="Search">
   <input name="searchString" id="searchStringBox" value=""/>
   <input type="submit" id="filterButton" value="Filtreeri" />
   <br /><br />
   <table class="listTable" id="listTable">
     <thead>
        <tr>
          <th scope="col">Nimi</th>
          <th scope="col">Kood</th>
          <th scope="col"></th>
        </tr>
     </thead>
    <tbody>

    

    </tbody>
   </table>
 </form>
</body>
</html>