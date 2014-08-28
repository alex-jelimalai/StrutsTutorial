package manning.ch3.utils;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 7/22/14
 * Time: 10:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class PortfolioService {
    private static Map<String, User> nameUserMap = new HashMap<>();
    private static Set<File> files = new HashSet<>();

    public boolean userExist(String username) {
        return nameUserMap.containsKey(username);
    }

    public void createUser(User user) {
        nameUserMap.put(user.getUsername(), user);
    }

    public void addImage(File pic) {
        files.add(pic);

    }
}
