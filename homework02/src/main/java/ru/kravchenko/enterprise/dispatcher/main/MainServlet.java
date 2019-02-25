package ru.kravchenko.enterprise.dispatcher.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Roman Kravchenko
 */

@WebServlet(name = "MainServlet", urlPatterns = "main")
public class MainServlet extends HttpServlet {

    private static Logger logger = LoggerFactory.getLogger(MainServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("MainServlet request");
        printPage(req, resp);
    }

    private void printPage(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html; charset=UTF-8");
        resp.getWriter().println("<body>");
        resp.getWriter().println("<h1>MAIN PAGE</h1>");
        resp.getWriter().println("<p><a href=\"catalog\" target=\"_blank\"> GO TO CATALOG</a></p>");
        resp.getWriter().println("<p><a href=\"cart\" target=\"_blank\"> GO TO CART</a>></p>");
        resp.getWriter().println("<p><a href=\"order\" target=\"_blank\"> GO TO ORDER</a>></p>");
        resp.getWriter().println("<p><a href=\"product\" target=\"_blank\"> GO TO PRODUCT</a>></p>");
        resp.getWriter().println("</body>");
    }

}
