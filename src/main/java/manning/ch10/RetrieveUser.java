package manning.ch10;


import com.opensymphony.xwork2.ActionSupport;
import manning.ch8.utils.PortfolioService;
import manning.ch8.utils.User;

/*
 *
 */

public class RetrieveUser extends ActionSupport {

    private String username;
    private Object jsonModel;

    public String execute() {

        User user = getPortfolioService().getUser(getUsername());
        setJsonModel(user);

        return SUCCESS;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Object getJsonModel() {
        return jsonModel;
    }

    public void setJsonModel(Object jsonModel) {
        this.jsonModel = jsonModel;
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
