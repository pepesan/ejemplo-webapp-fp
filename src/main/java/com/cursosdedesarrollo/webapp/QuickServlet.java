package com.cursosdedesarrollo.webapp;

import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "QuickServlet",
        urlPatterns = {"/hello"},
        loadOnStartup = 1
)

public class QuickServlet extends HttpServlet {
    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        ServletOutputStream out = response.getOutputStream();
        out.print(
                "<html>" +
                        "<head>" +
                            "<title>QuickServlet</title>"+
                            "<meta charset=\"UTF-8\">"+
                        "</head>"+
                        "<body>"+
                            "<nav>\n" +
                            "    <ul>\n" +
                            "        <li><a href =\"${pageContext.request.contextPath}\">Home</a></li>\n" +
                            "        <li><a href=\"${pageContext.request.contextPath}/hello\">QuickServlet</a></li>\n" +
                            "        <li><a href=\"${pageContext.request.contextPath}about.jsp\">About</a> </li>\n" +
                            "    </ul>\n" +
                            "</nav>"+
                            "<p>Hello there from Servlet</p>"+
                        "</body>"+
                "</html>");
    }
}