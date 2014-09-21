package manning.ch9;


import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import manning.utils.Portfolio;
import manning.utils.PortfolioServiceInterface;
import manning.utils.Struts2PortfolioConstants;
import manning.utils.User;

/*
 * This is our first version of the Register action.  This version uses
 * the basic validation and message localization services provided by the 
 * ActionSupport help class.  By extending this class, we automatically
 * receive implementations of several interfaces that allow us to do
 * validation and localize our message texts with out polluting the
 * execute() method of our action.   
 */

public class Register extends ActionSupport implements SessionAware {
	
	public String execute(){
		
		/*
		 * Create and move the data onto our application domain object, user.
		 */
		User user = new User();
		user.setPassword( getPassword() );
		Portfolio newPort = new Portfolio();
		newPort.setName( getPortfolioName() );
		user.addPortfolio( newPort );
		user.setUsername( getUsername() );
		user.setFirstName( getFirstName());
		user.setLastName( getLastName() );
		System.out.println("junkmail = " + isReceiveJunkMail());
		
		getPortfolioService().persistUser( user);
		
		session.put( Struts2PortfolioConstants.USER, user );
		
		
		return SUCCESS;
	}
	
	
	/* JavaBeans Properties to Receive Request Parameters */
	
	private String username;
	private String password;
	private String portfolioName;
	private String firstName;
	private String lastName;
	private boolean receiveJunkMail;

	public String getPortfolioName() {
		return portfolioName;
	}
	public void setPortfolioName(String portfolioName) {
		this.portfolioName = portfolioName;
	}
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
		if ( getPortfolioName().length() == 0  ){			
			addFieldError( "portfolioName", getText( "portfolioName.required" ));
		}		
		/* Make sure user doesn't already have an account */
		if (getPortfolioService().userExists(getUsername() ) ){		
			addFieldError("username", getText( "user.exists"));
		}
		
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
	
	private Map session;
	
	public void setSession(Map session) {
		
		this.session = session;
	}
	
	

}
