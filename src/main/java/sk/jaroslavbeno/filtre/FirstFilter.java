package sk.jaroslavbeno.filtre;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import java.io.IOException;

@WebFilter(urlPatterns = {"/*"},
        filterName = "FirstFilter name",
        initParams = {@WebInitParam(name = "meno", value = "Jarko Beno")})
public class FirstFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("som vo filtry");
        System.out.println(filterConfig.getFilterName());
        System.out.println(filterConfig.getInitParameter("meno"));
        filterConfig.getServletContext().setAttribute("filter","First filter kontext upraveny");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

    }

    @Override
    public void destroy() {

    }
}
