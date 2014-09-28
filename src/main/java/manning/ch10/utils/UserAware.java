package manning.ch10.utils;


/*
 * Simple interface for actions that want have the user object injected.  
 */

public interface UserAware {

    public void setUser(User user);

}