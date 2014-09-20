package manning.ch8;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.opensymphony.xwork2.ActionContext;

/**
 * @author Alexandr Jelimalai
 */
public class AnotherServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.getOutputStream().println("<html>");
        resp.getOutputStream().println("<head>");
        resp.getOutputStream().println("</head>");
        resp.getOutputStream().println("<body>");
        resp.getOutputStream().println("<p>Hello from another servlet's doPost()</p>");
        resp.getOutputStream().println("<p>Attribute set in the struts 2 action = " + req.getAttribute("attributeSetInS2Action") + "</p>");
        resp.getOutputStream().println("<p>Favorite color from request parameter = " + req.getAttribute("favoriteColor") + "</p>");

        String propertyFromAction = (String)ActionContext.getContext().getValueStack().findValue("testProperty");
        resp.getOutputStream().println("<p>Value retrieved from action property on ValueStack = " + propertyFromAction + "</p>");
        resp.getOutputStream().println("</body>");
        resp.getOutputStream().println("</html>");
    }
}
