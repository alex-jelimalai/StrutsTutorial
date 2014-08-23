package manning.chapterFive;

import com.opensymphony.xwork2.ActionSupport;
import manning.chapterFive.utils.PortfolioService;
import manning.chapterFive.utils.Struts2PortfolioConstants;
import manning.chapterFive.utils.User;
import manning.chapterFive.utils.UserAware;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

/**
 * @author Alexandr Jelimalai
 */
public class Login extends ActionSupport implements UserAware, SessionAware {

    private String username;
    private String password;
    private Map<String, Object> session;
    private User user;


    @Override
    public String execute() {
        User user = getPortfolioService().authenticateUser(getUsername(), getPassword());
        if (user == null) {
            return INPUT;
        } else {
            session.put(Struts2PortfolioConstants.USER, user);
        }
        return SUCCESS;
    }


    public void validate() {

        if (getPassword().length() == 0) {
            addFieldError("password", getText("password.required"));
        }
        if (getUsername().length() == 0) {
            addFieldError("username", getText("username.required"));
        }

    }


    private String getPassword() {
        return password;
    }


    private String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }


    public PortfolioService getPortfolioService() {
        return new PortfolioService();
    }


    @Override
    public void setUser(User user) {
        this.user = user;
    }
}
