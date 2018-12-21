<html>
<body>
<h2>Hello World! redeploy</h2>

<%
    int j = 0;
    int k = 1;
    int l = j+k;

%>
Hodnota l je <%=l%><br>

<%=l+4%><br>
<%=4+5-2%><br>
<%=new String("jaro")%><br>
<%="jaro beno"%><br>


<%!
public int spocitaj(int a, int b){
    return a+b;
}
%>

<p>Spocitaj a + b = <%=spocitaj(10,5)%> </p>

<%
    int a = 10;
    int b = 100;
    int vysledok = spocitaj(a,b);
    out.println("Vysledok spocitaj je: "+vysledok);
%>

<%
    for(int i = 0; i<10; i++){
        out.println(i+"</br>");
    }
%>

<%
    for(int i = 0; i<10; i++){
    %>
        <p><%=i%></p>
    <%
    }
%>






</body>
</html>
