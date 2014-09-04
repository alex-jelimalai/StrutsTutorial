package manning.ch7;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import manning.ch7.utils.User;
import manning.ch7.utils.UserAware;

/*
 * This action just loads the data to pre-populate our update form. The data is retrieved
 * by letting the UserAware interface inject the user object that is kept in session
 * scope as a means of keeping track of whether a user is logged in or not.   
 */

public class UpdateAccountForm extends ActionSupport implements UserAware,
        ModelDriven {

    private User user;

	/*
     * This is the UserAware interface that allows the AuthenticationIntercptor
	 * to inject the user object for a logged in user. Since this action is in
	 * the secure package of actions, we can safely assume that the user must be
	 * logged in.
	 */

    public String execute() {

		/*
         * Since this is essentially an empty action that passes through to our
		 * update form, and the user data is already put in place by the
		 * UserAware interface, we don't need to do anything here.
		 *
		 * IN FACT, we could have omitted this method definition altogether
		 * since it mirrors exactly the implementation of execute already
		 * provided by ActionSupport; we put this here to keep everything
		 * transparent for educational purposes.
		 */
        return SUCCESS;
    }

    public void setUser(User user) {
        this.user = user;
    }

    /*
     * We know that the user is set already because the authentication
     * interceptor is first in the stack.
     */
    public Object getModel() {
        return user;
    }

}
