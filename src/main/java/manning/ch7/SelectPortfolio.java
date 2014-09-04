package manning.ch7;


import com.opensymphony.xwork2.ActionSupport;
import manning.ch7.utils.PortfolioService;
import manning.ch7.utils.User;

import java.util.Collection;

/*
 * The SelectPortfolio action recieves the artist username from the list on
 * the PortfolioHomePage.  It then will retrieve the portfolios for that artist
 * to display.   
 */

public class SelectPortfolio extends ActionSupport {


    private String username;

    /* JavaBeans Properties to Receive Request Parameters */
    private Collection portfolios;

    public String execute() {

        User user = getPortfolioService().getUser(getUsername());
        portfolios = user.getPortfolios().values();
        return SUCCESS;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Collection getPortfolios() {
        return portfolios;
    }

    public void validate() {

		/* Retrieve our simple portfolio service object. */
        PortfolioService ps = getPortfolioService();

        if (getUsername().length() == 0) {
            addFieldError("username", getText("username.required"));
        }

    }

    /*
     * Simple way to retrieve our business logic and data peristence
     * object.  Late versions of the portfolio app will intergrate with
     * more sophisticated technologies for these services.
     */
    public PortfolioService getPortfolioService() {

        return new PortfolioService();

    }

}
