<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="sk.jaroslavbeno.app.model.Film" %>
<%@ page import="java.util.List" %>
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

<h4>Filmy:</h4>
<ul>
<%

List<Film> films = (List<Film>) request.getAttribute("filmy");
if(films !=null){
    for(Film film : films){
        out.print("<li>"+film.getNazov()+"</li>");
    }
}
%>
</ul>


</body>
</html
