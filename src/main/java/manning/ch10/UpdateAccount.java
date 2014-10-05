package manning.ch10;


import manning.utils.PortfolioServiceInterface;
import manning.utils.User;
import manning.utils.UserAware;

import com.opensymphony.xwork2.ActionSupport;

/*
 * UpdateAccount takes the information from the update form and persists
 * the new user account information.
  */

public class UpdateAccount extends ActionSupport implements UserAware {
	


	public String execute(){
		
		/*
		 * Move the new, already validated data onto our application domain object, user, and persist that user.
		 */
		
		
		portfolioService.updateUser(getUser());
		
		return SUCCESS;
		
	}
	
	public String executeMe(){
		
		/*
		 * Move the new, already validated data onto our application domain object, user, and persist that user.
		 */
		portfolioService.updateUser(getUser());
	
	
		return SUCCESS;
		
	}
	
	private User user;
	
	public void setUser(User user) {
		this.user = user;
	}
	public User getUser() {
		return user;
	}
	
	private PortfolioServiceInterface portfolioService;
	
	public PortfolioServiceInterface getPortfolioService( ) 	{
		
		return portfolioService;
		
	}	
	public void setPortfolioService( PortfolioServiceInterface portService){
		portfolioService = portService;
	}
	
}
