package manning.ch9;


import com.opensymphony.xwork2.ActionSupport;
import manning.utils.Portfolio;
import manning.utils.PortfolioServiceInterface;
import manning.utils.User;
import manning.utils.UserAware;

/*
 * Create Portfolio allows the user to add another portfolio to their 
 * account. 
 */

public class CreatePortfolio extends ActionSupport implements UserAware {

	public String execute(){
		
		/*
		 * Create and move the data onto our application domain object, user.
		 */
		
		Portfolio newPortfolio = new Portfolio();
		newPortfolio.setName( getName() );
		user.addPortfolio( newPortfolio );
		portfolioService.updateUser(user);
		
		return SUCCESS;
	}
	
	
	/* JavaBeans Properties to Receive Request Parameters */
	

	private String name;
	private User user;
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	/* 
	 * Validateable Implmentation 
	 */
	
	public void validate(){
		
		if ( getName().length() == 0 ){			
			addFieldError( "name", getText("name.required") );
		}
		
	}

	public void setUser(User user) {
		this.user=user;
		
	}
	public User getUser(){
		return user;
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
