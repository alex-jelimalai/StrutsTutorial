package manning.ch6;

import java.util.Collection;

import com.opensymphony.xwork2.ActionSupport;
import manning.ch6.utils.PortfolioService;

/*
 * This action provides a list of portfolios available for viewing.
 */

public class ViewPortfolios extends ActionSupport {

    public String execute() throws Exception {

        setUsers(getPortfolioService().getUsers());

        return SUCCESS;
    }

    /* JavaBeans Properties to Receive Request Parameters */

    public Collection users;


    public Collection getUsers() {
        return (Collection)users;
    }


    public void setUsers(Collection users) {
        this.users = users;
    }


    /*
     * Simple way to retrieve our business logic and data peristence object. Late versions of the portfolio app will intergrate with more sophisticated
     * technologies for these services.
     */
    public PortfolioService getPortfolioService() {

        return new PortfolioService();

    }

}
