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

<c:out value="${film.nazov}" />

<c:set var="meno" scope="application" value="Jaro"/>
<br>
meno> <c:out value="${applicationScope.meno}" />
<c:remove var="meno" />
<br>
meno> <c:out value="${applicationScope.meno}" />

<br>
<c:if test = "${vek < 18}">
    <p>Vek je menej ako 18 a je to presne:  <c:out value = "${vek}"/><p>
</c:if>

<br>
<c:choose>
    <c:when test="${vek > 18}">
        <c:out value="vek ${vek} je > ako 18"/>
    </c:when>
    <c:when test="${vek < 18}">
        <c:out value="vek ${vek} je < ako 18"/>
    </c:when>
    <c:otherwise>
        <c:out value="vek ${vek} je = 18"/>
    </c:otherwise>
</c:choose>


</body>
</html
