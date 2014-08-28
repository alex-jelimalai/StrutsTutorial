package manning.ch3.modelDriven;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import manning.ch3.utils.PortfolioService;
import manning.ch3.utils.User;

/**
 * User: Alexandr Jelimalai
 */
public class ModelDrivenRegister extends ActionSupport implements ModelDriven {
    private User user = new User();

    @Override
    public String execute() throws Exception {
        getPortfolioService().createUser(user);
        return SUCCESS;
    }

    @Override
    public void validate() {
        PortfolioService portfolioService = getPortfolioService();
        if (user.getPassword().trim().isEmpty()) {
            addFieldError("password", getText("password.required"));
        }
        if (user.getUsername().trim().isEmpty()) {
            addFieldError("username", getText("username.required"));
        }
        if (user.getPortfolioName().trim().isEmpty()) {
            addFieldError("portfolioName", getText("portfolioName.required"));
        }
        if (portfolioService.userExist(user.getUsername())) {
            addFieldError("portfolioName", getText("user.exists"));
        }
    }

    public PortfolioService getPortfolioService() {
        return new PortfolioService();
    }

    @Override
    public Object getModel() {
        return user;
    }
}
