package manning.ch10;


import com.opensymphony.xwork2.ActionSupport;
import manning.utils.PortfolioServiceInterface;
import manning.utils.User;

/*
 *
 */

public class RetrieveUser extends ActionSupport  {

	public String execute(){
		
		User user = getPortfolioService().getUser( getUsername() );
		setJsonModel(user);
		
		return SUCCESS;
	}
	private String username;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	private Object jsonModel;
	
	public Object getJsonModel() {
		return jsonModel;
	}


	public void setJsonModel(Object jsonModel) {
		this.jsonModel = jsonModel;
	}

	
	private PortfolioServiceInterface portfolioService;
	
	public PortfolioServiceInterface getPortfolioService( ) 	{
		
		return portfolioService;
		
	}
	public void setPortfolioService( PortfolioServiceInterface portService){
		portfolioService = portService;
	}
	
	

}
