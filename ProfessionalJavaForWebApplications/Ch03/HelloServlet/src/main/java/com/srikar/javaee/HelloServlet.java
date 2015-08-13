/*
 HelloServlet!
 */
package com.srikar.javaee;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author vedantas
 */
public class HelloServlet extends HttpServlet {

    @Override
    public void init() {
        System.out.println("Initializing " + this.getServletName() + "!");
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();
        writer.println("<!DOCTYPE html>");
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>");
        writer.println("A Hello Servlet");
        writer.println("</title>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<h2 align=\"center\">");
        writer.println("Hello " + request.getRemoteHost() + ", from " + this.getServletName() + "!");
        writer.println("</h2>");
        writer.println("</body>");
        writer.println("</html>");
    }

    @Override
    public void destroy() {
        System.out.println("Destroying " + this.getServletName() + "!");
    }

}
