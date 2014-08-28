package manning.ch3.objectBacked;

import com.opensymphony.xwork2.ActionSupport;
import manning.ch3.utils.PortfolioService;
import manning.ch3.utils.User;

/**
 * User: Alexandr Jelimalai
 */
public class ObjectBackedRegister extends ActionSupport {
    private User user;

    @Override
    public String execute() throws Exception {
        getPortfolioService().createUser(user);
        return SUCCESS;
    }

    @Override
    public void validate() {
        PortfolioService portfolioService = getPortfolioService();
        if (user.getPassword().trim().isEmpty()) {
            addFieldError("user.password", getText("password.required"));
        }
        if (user.getUsername().trim().isEmpty()) {
            addFieldError("user.username", getText("username.required"));
        }
        if (user.getPortfolioName().trim().isEmpty()) {
            addFieldError("user.portfolioName", getText("portfolioName.required"));
        }
        if (portfolioService.userExist(user.getUsername())) {
            addFieldError("user.portfolioName", getText("user.exists"));
        }
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public PortfolioService getPortfolioService() {
        return new PortfolioService();
    }
}
