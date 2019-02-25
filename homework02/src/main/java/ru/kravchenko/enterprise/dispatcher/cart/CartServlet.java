package ru.kravchenko.enterprise.dispatcher.cart;

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

@WebServlet(name = "CartServlet", urlPatterns = "cart")
public class CartServlet extends HttpServlet {

    private static Logger logger = LoggerFactory.getLogger(CartServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("CartServlet request");
        printPage(req, resp);
    }

    private void printPage(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html; charset=UTF-8");
        resp.getWriter().println("<body>");
        resp.getWriter().println("<h1>CART</h1>");
        resp.getWriter().println("<p><a href=\"main\" style=\"...\"> MAIN</a></p>");
        resp.getWriter().println("<p><a href=\"catalog\" style=\"...\"> CATALOG</a></p>");
        resp.getWriter().println("<p><a href=\"order\" style=\"...\"> ORDER</a></p>");
        resp.getWriter().println("<p><a href=\"product\" style=\"...\"> PRODUCT</a></p>");
        resp.getWriter().println("</body>");
    }

}
