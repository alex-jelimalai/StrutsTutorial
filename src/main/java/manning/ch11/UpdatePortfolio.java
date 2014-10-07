package manning.ch11;


import manning.utils.Portfolio;
import manning.utils.PortfolioServiceInterface;
import manning.utils.UserAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

/*
 * UpdatePortfolio demonstrates the technique for using a domain model
 * exposed directly to the data transfer, with Hibernate loading. This action
 * must be used with a paramsPrepareParams interceptor stack.  The first params
 * transfer sets the id onto the JavaBeans property and the prepare interceptor
 * invokes our prepare method.  This method loads the Portfolio
 * object, using that Id, and sets it onto the Portfolio property, which then 
 * receives the transfer of the data from the second params interceptor. 
 */

public class UpdatePortfolio extends ActionSupport implements Preparable {


	public String execute(){
		
		portfolioService.updatePortfolio( getPortfolio() );

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
	
	public void prepare() throws Exception {
		System.out.println("id = " + getId());
		portfolio = getPortfolioService().getPortfolio( getId() );
		
	}
	
	
}
