package manning.ch8;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Alexandr Jelimalai
 */
public class SearchEngineAction extends ActionSupport {

    private String defaultUsername;


    public String getDefaultUsername() {
        return defaultUsername;
    }


    public void setDefaultUsername(String defaultUsername) {
        this.defaultUsername = defaultUsername;
    }
}
