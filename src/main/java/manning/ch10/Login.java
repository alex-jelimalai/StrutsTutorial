package manning.ch10;


import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import manning.ch10.utils.PortfolioService;
import manning.ch10.utils.Struts2PortfolioConstants;
import manning.ch10.utils.User;

/*
 * The Login action takes a username and password from the request
 * and authenticates those tokens against the portfolioService objects
 * authentication methods.  If the user is valid, the user object
 * is stored in the session map. 
 * 
 * To receive the session map, this action implements the sessionAware
 * interface.  This decouples the action from the servlet API.  Of course,
 * the action could use the ActionContext to get this map, or even the 
 * underlying Servlet Session object, but these would be needless bindings 
 * to the Servlet API, certainly complicating testing. 
 */

public class Login extends ActionSupport implements SessionAware {


    private String username;
    private String password;

    /* JavaBeans Properties to Receive Request Parameters */
    private Map session;

    public String execute() {

        User user = getPortfolioService().authenticateUser(getUsername(), getPassword());
        if (user == null) {
            /* User not valid, return to input page. */
            return INPUT;
        } else {
            session.put(Struts2PortfolioConstants.USER, user);
        }

        return SUCCESS;
    }

    public String getTestProperty() {
        return "777";
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void validate() {

		/* Retrieve our simple portfolio service object. */
        PortfolioService ps = getPortfolioService();
		
		/* Check that fields are not empty */
        if (getPassword().length() == 0) {
            addFieldError("password", getText("password.required"));
        }
        if (getUsername().length() == 0) {
            addFieldError("username", getText("username.required"));
        }

    }

    /*
     * Simple way to retrieve our business logic and data persistence
     * object.  Late versions of the portfolio app will integrate with
     * more sophisticated technologies for these services.
     */
    public PortfolioService getPortfolioService() {

        return new PortfolioService();

    }

    public void setSession(Map session) {
        this.session = session;

    }


}
