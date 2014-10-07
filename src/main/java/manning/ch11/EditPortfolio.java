package manning.ch11;


import manning.utils.Portfolio;
import manning.utils.PortfolioServiceInterface;

import com.opensymphony.xwork2.ActionSupport;

/*
 * Create Portfolio allows the user to add another portfolio to their 
 * account. 
 */

public class EditPortfolio extends ActionSupport {


	public String execute(){
		
		/*
		 * Create and move the data onto our application domain object, user.
		 */
		
		portfolio = getPortfolioService().getPortfolio(id);
				
		return SUCCESS;
	}
	
	
	/* JavaBeans Properties to Receive Request Parameters */
	

	private Long id;
	private Portfolio portfolio;
	

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Portfolio getPortfolio() {
		return portfolio;
	}
	public void setPortfolio(Portfolio portfolio) {
		this.portfolio = portfolio;
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
