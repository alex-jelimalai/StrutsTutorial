package manning.ch9;


import java.util.Collection;

import com.opensymphony.xwork2.ActionSupport;
import manning.utils.PortfolioServiceInterface;

/*
 * This action retrieves the data model for building the Struts 2 Portfolio HomePage.
 * This mostly consists of a list of the current user/accounts. 
 */

public class PortfolioHomePage extends ActionSupport {
	
	public String execute(){
		Collection users =  getPortfolioService().getUsers();
		setUsers( users );
		
		String selectedUsername = getPortfolioService().getDefaultUser();
		setDefaultUsername( selectedUsername );
		
		return SUCCESS;
	}
	
	/* JavaBeans Properties to Receive Request Parameters */
	
	private Collection users;
	private String defaultUsername;
	
	public Collection getUsers() {
		return users;
	}

	public void setUsers(Collection users) {
		this.users = users;
	}
	
	public String getDefaultUsername() {
		return defaultUsername;
	}

	public void setDefaultUsername(String username) {
		this.defaultUsername = username;
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
