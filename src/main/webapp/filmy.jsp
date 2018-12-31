<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>Vyber žáner pre zobrazenie filmov:</h2>
<form method='post' action='filmycont'>
    <select name='zaner'>
        <option value='akcne'>Akčné</option>
        <option value='scifi'>Sci-fi</option>
    </select>
    <input type='submit' name='Vyber' />
<form>

<ul>
<c:forEach items="${filmy}" var="film">
    <li>${film.nazov} - ${film.zaner}</li>
</c:forEach>
</ul>

</body>
</html
