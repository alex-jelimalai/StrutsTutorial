package manning.ch11;

import java.util.ListResourceBundle;

public class UserBundle extends ListResourceBundle {

	
	private Object[][] contents = {
	   { "userBundleMessage", "HelloFromClassBundle" }
	  
	};
	 
	protected Object[][] getContents() {
	   return contents;
	}
	

}
