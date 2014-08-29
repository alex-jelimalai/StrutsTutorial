package manning.ch6;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionSupport;

/*
 * This action serves as a target of the Struts 2 action 
 * tag for purposes of demonstration.
 */

public class TargetAction extends ActionSupport implements RequestAware {
	public String execute() throws Exception {

		/*
		 * put some data into the request scope so that it can be accessed by
		 * the original action.
		 */
		request.put("dataFromSecondAction", "HelloFromSecondaryAction");
		return SUCCESS;

	}

	/*
	 * JavaBeans property that will receive the map of request attributes via
	 * the RequestAware interface.
	 */
	private Map request;

	public void setRequest(Map arg0) {
		request = arg0;
	}

	public Map getRequest() {
		return request;
	}

}
