package manning.ch4;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import manning.ch4.utils.Struts2PortfolioConstants;
import manning.ch4.utils.User;
import manning.ch4.utils.UserAware;

/**
 * @author Alexandr Jelimalai
 */
public class AuthenticationInterceptor implements Interceptor {

    @Override
    public void destroy() {
    }


    @Override
    public void init() {
    }


    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        Map<String, Object> session = actionInvocation.getInvocationContext().getSession();
        User user = (User)session.get(Struts2PortfolioConstants.USER);
        if (user == null) {
            return Action.LOGIN;
        } else {
            Action action = (Action)actionInvocation.getAction();
            if (action instanceof UserAware) {
                ((UserAware)action).setUser(user);
            }
        }
        return actionInvocation.invoke();
    }
}
