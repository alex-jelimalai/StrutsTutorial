package manning.ch10;


import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import manning.utils.Portfolio;
import manning.utils.PortfolioServiceInterface;
import manning.utils.Struts2PortfolioConstants;
import manning.utils.User;

import com.opensymphony.xwork2.ActionSupport;

/*
 * This version of Register uses the Validation Framework, instead of the 
 * Validateable interfaces validate() method. 
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
		user.setEmail(getEmail());
		
		System.out.println("junkmail = " + isReceiveJunkMail());
		
		/* Login the newly created user */
		getPortfolioService().persistUser( user );
		session.put( Struts2PortfolioConstants.USER, user );
		
		
		return SUCCESS;
	}
	
	
	/* JavaBeans Properties to Receive Request Parameters */
	
	private String username;
	private String password;
	private String portfolioName;
	private String firstName;
	private String lastName;
	private String email;
	private boolean receiveJunkMail;

	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
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
