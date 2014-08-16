package manning.chapterThree;

import com.opensymphony.xwork2.ActionSupport;
import manning.chapterThree.utils.PortfolioService;
import manning.chapterThree.utils.User;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 7/22/14
 * Time: 10:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class Register extends ActionSupport {
    private String username;
    private String password;
    private String portfolioName;

    @Override
    public String execute() throws Exception {
        User user = new User();
        user.setUsername(getUsername());
        user.setPassword(getPassword());
        user.setPortfolioName(getPortfolioName());
        return SUCCESS;
    }

    @Override
    public void validate() {
        PortfolioService portfolioService = getPortfolioService();
        if (getPassword().trim().isEmpty()) {
            addFieldError("password", getText("password.required"));
        }
        if (getUsername().trim().isEmpty()) {
            addFieldError("username", getText("username.required"));
        }
        if (getPortfolioName().trim().isEmpty()) {
            addFieldError("portfolioName", getText("portfolioName.required"));
        }
        if (portfolioService.userExist(getUsername())) {
            addFieldError("portfolioName", getText("user.exists"));
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPortfolioName() {
        return portfolioName;
    }

    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    public PortfolioService getPortfolioService() {
        return new PortfolioService();
    }
}
