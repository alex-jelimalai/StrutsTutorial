package manning.ch10;


import java.util.Collection;

import manning.utils.PortfolioServiceInterface;

import com.opensymphony.xwork2.ActionSupport;

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
	private PortfolioServiceInterface portfolioService;
	
	public PortfolioServiceInterface getPortfolioService( ) 	{
		
		return portfolioService;
		
	}
	public void setPortfolioService( PortfolioServiceInterface portService){
		portfolioService = portService;
	}
	
	

}
