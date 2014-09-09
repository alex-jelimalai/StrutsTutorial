package manning.ch8;

import com.opensymphony.xwork2.ActionSupport;
import manning.ch8.utils.PortfolioService;

import java.util.Collection;

/*
 * This action retrieves the data model for building the Struts 2 Portfolio HomePage.
 * This mostly consists of a list of the current user/accounts. 
 */

public class PortfolioHomePage extends ActionSupport {

    private Collection users;

    /* JavaBeans Properties to Receive Request Parameters */
    private String defaultUsername;

    public String execute() {
        Collection users = getPortfolioService().getUsers();
        setUsers(users);

        String selectedUsername = getPortfolioService().getDefaultUser();
        setDefaultUsername(selectedUsername);

        return SUCCESS;
    }

    public Collection getUsers() {
        return users;
    }

    public void setUsers(Collection users) {
        this.users = users;
    }

    public String getDefaultUsername() {
        return defaultUsername;
    }

    public void setDefaultUsername(String username) {
        this.defaultUsername = username;
    }

    /*
     * Simple way to retrieve our business logic and data persistence object.
     * Late versions of the portfolio app will integrate with more
     * sophisticated technologies for these services.
     */
    public PortfolioService getPortfolioService() {

        return new PortfolioService();

    }

}
