package sk.jaroslavbeno.servlety;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/simpleservlet", "/daco"})
public class SimpleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        out.println("<!DOCTYPE html> <html> <body>");
        out.print("<h1>Som v SimpleServlet - mäkčenéééé</h1>");


        String meno = req.getParameter("meno");
        String priezvisko = req.getParameter("priezvisko");

        out.println("<br>");
        out.printf("meno: %s", meno);
        out.println("<br>");
        out.printf("priezvisko: %s", priezvisko);
        out.println("</body> </html>");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String meno = req.getParameter("meno");
        String stranka = req.getParameter("stranka");

//        resp.sendRedirect(String.format("simpleservlet?meno=%s&stranka=%s", meno, stranka));
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html> <html><body>");

        out.print("<h1>Som v SimpleServlet POST</h1>");;

        out.println("<br>");
        out.printf("meno: %s", meno);
        out.println("<br>");
        out.printf("stranka: %s", stranka);

        String priezvisko = req.getParameter("priezvisko");
        out.println("<br>");
        out.printf("priezvisko: %s", priezvisko);

        String pohlavie = req.getParameter("pohlavie");
        out.println("<br>");
        out.printf("pohlavie: %s", pohlavie);

//        String stat = req.getParameter("stat");
//        out.println("<br>");
//        out.printf("stat: %s", stat);

        String[] stat = req.getParameterValues("stat");
        out.println("<br>");
        for(int i = 0; i<stat.length; i++){
            out.printf("%s, ", stat[i]);

        }



        out.println("</body> </html>");

    }
}
