package manning.ch9;


import manning.utils.PortfolioServiceInterface;
import manning.utils.User;
import manning.utils.UserAware;

import com.opensymphony.xwork2.ActionSupport;

/*
 * This is our first version of the Register action.  This version uses
 * the basic validation and message localization services provided by the 
 * ActionSupport help class.  By extending this class, we automatically
 * receive implementations of several interfaces that allow us to do
 * validation and localize our message texts with out polluting the
 * execute() method of our action.   
 */

public class UpdateAccount extends ActionSupport implements UserAware {
	

	public String execute(){
		
		/*
		 * Move the new, already validated data onto our application domain object, user, and persist that user.
		 */
		
		user.setPassword( getPassword() );
		user.setFirstName( getFirstName());
		user.setLastName( getLastName() );
		user.setUsername( getUsername() );
		portfolioService.updateUser(user);
		
		return SUCCESS;
		
	}
	
	
	/* JavaBeans Properties to Receive Request Parameters */
	
	private String username;
	private String password;
	public boolean receiveJunkMail;
	private String firstName;
	private String lastName;

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public boolean isReceiveJunkMail() {
		return receiveJunkMail;
	}
	public void setReceiveJunkMail(boolean receiveJunkMail) {
		this.receiveJunkMail = receiveJunkMail;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

	public void validate(){
		
		
		/* Check that fields are not empty */
		if ( getPassword().length() == 0 ){			
			addFieldError( "password", getText("password.required") );
		}
		if ( getUsername().length() == 0 ){			
			addFieldError( "username", getText("username.required") );
		}
	
	}

	private User user;
	
	public void setUser(User user) {
	
		this.user = user;
		
	}
	
	/*
	 * Field with getter and setter for PortfolioService object, which will be injected
	 * via Spring.	
	 */
	
	PortfolioServiceInterface portfolioService;

	public PortfolioServiceInterface getPortfolioService( ) 	{
		
		return portfolioService;
	
	}
	
	public void setPortfolioService(PortfolioServiceInterface portfolioService) {
		this.portfolioService = portfolioService;
	}
		

}
