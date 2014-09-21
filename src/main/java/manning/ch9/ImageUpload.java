package manning.ch9;


import java.io.File;

import manning.utils.PortfolioServiceInterface;
import com.opensymphony.xwork2.ActionSupport;

/*
 * This action uploads an image file using the default fileUpload 
 * interceptor.  The interceptor is in the default stack and the only
 * thing we have to do here in the action is implement JavaBean's 
 * properties to receive the File and meta-data from the interceptor.
 */

public class ImageUpload extends ActionSupport {
	

	public String execute()throws Exception{
		
		/*
		 * Add the image to the portfolio.
		 */
		
		getPortfolioService().addImage( getPic(), getPicFileName(), id );
		return SUCCESS;
		
	}
	
	/* JavaBeans Properties to Receive Request Parameters */

	File pic;
	String picContentType;
	String picFileName;
	String id;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public File getPic() {
		return pic;
	}
	
	public void setPic(File pic) {
	    this.pic = pic;
	    System.out.println("file = " + pic);
	}
	
	public String getPicContentType() {
		return picContentType;
	}
	
	public void setPicContentType(String picContentType) {
	    this.picContentType = picContentType;
	    System.out.println("content type = " + picContentType);
	}
	
	public void setPicFileName(String picFileName) {
		this.picFileName = picFileName;
		 System.out.println("file name = " + picFileName);
	}
	public String getPicFileName() {
		return picFileName;
		
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
