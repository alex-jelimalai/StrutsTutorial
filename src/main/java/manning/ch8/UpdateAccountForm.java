package manning.ch8;


import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import manning.ch8.utils.PortfolioService;
import manning.ch8.utils.User;
import manning.ch8.utils.UserAware;

/*
 * This action just loads the data to prepopulate our update form. The data is retrieved
 * by letting the UserAware interface inject the user object that is kept in session
 * scope as a means of keeping track of whether a user is logged in or not.   
 */

public class UpdateAccountForm extends ActionSupport implements UserAware, ModelDriven {


    private User user;

	/*  
     * Simple way to retrieve our business logic and data peristence
	 * object.  Late versions of the portfolio app will intergrate with
	 * more sophisticated technologies for these services.
	 */

    public String execute() {

		/* Since this is essentially and empty action that pass through to our
         * update form, and the user data is already put in place by the UserAware
		 * interface, we don't need to do anything here.
		 */
        return SUCCESS;
    }

	/* This is the UserAware interface that allows the AuthenticationIntercptor to inject
     * the user object for a logged in user.  Since this action is in the secure package of
	 * actions, we can safely assume that the user must be logged in.  
	 */

    public PortfolioService getPortfolioService() {

        return new PortfolioService();

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    /* We know that the user is set already because the authentication interceptor
     * is first in the stack.
     */
    public Object getModel() {
        return user;
    }


}
