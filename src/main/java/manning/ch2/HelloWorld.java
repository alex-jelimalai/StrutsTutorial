package manning.ch2;

import com.opensymphony.xwork2.Action;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 7/19/14
 * Time: 7:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorld implements Action {
    private static final String GREETING = "Hello ";
    private String name;
    private String customGreeting;

    public String execute() {
        setCustomGreeting(GREETING + getName());
        return "SUCCESS";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomGreeting() {
        return customGreeting;
    }

    public void setCustomGreeting(String customGreeting) {
        this.customGreeting = customGreeting;
    }
}
