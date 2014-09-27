package manning.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PortfolioServiceInMemory implements PortfolioServiceInterface {

    /*
     * This is implemented as the memory only persistence until we add the XML file backed persistence.
     */
    private static Map users = new HashMap();


    public boolean userExists(String username) {

        return users.containsKey(username);

    }


    @Override
    public void updateUser(manning.utils.User user) {
    }


    public void createAccount(User user) {
        /* Persist account. */
        users.put(user.getUsername(), user);
    }


    public void updateAccount(User user) {

        /* update account */
    }


    /*
     * At this point the application doesn't actually associate the images with a portfolio. This just saves the file to the application's root filesystem
     */

    public void addImage(File pic, String fileName, String fileSystemHome) throws IOException {
        /* add image to the portfolio and save image file to local filesystem */
        FileInputStream in = null;
        FileOutputStream out = null;

        String directoryName = fileSystemHome;
        File dir = new File(directoryName);
        if (!dir.exists())
            dir.mkdir();
        String targetPath = dir.getPath() + dir.separator + fileName;

        File picDestination = new File(targetPath);
        try {
            in = new FileInputStream(pic);
            out = new FileOutputStream(picDestination);
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }

        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }

        // add file name to portfolio!

    }


    /*
     * Returns a user object if the username and password are valid. Returns null otherwise.
     */
    public User authenticateUser(String username, String password) {

        System.out.println("Authenticating: username = " + username);

        /*
         * Retrive a user object. We're building a copy so that it mirrors the behaviour of the peristence backed object.
         */
        User persistedUser = (User)users.get(username);
        User userModel = null;
        /* If the username mapped to a real user, check password */
        if (persistedUser != null && persistedUser.getPassword().equals(password)) {

            /* create User object to return for the application to use */
            userModel = getModelCopy(persistedUser);
        }

        return userModel;
    }


    public void persistUser(User user) {

        String key = user.getUsername();
        System.out.println("persisting username = " + key + ", key exists = " + users.containsKey(key));
        System.out.println("password = " + user.getPassword());
        users.remove(user.getUsername());
        users.put(user.getUsername(), user);

    }


    /*
     * This is so we can keep our memory persistence objects separate from the objects used by the application. Pretending like the memory map is more of a
     * persistence storage so that we have methods more applicable to persistent storage when we change this.
     */
    private User getModelCopy(User persistedUser) {
        return null;
    }


    public Collection getUsers() {

        ArrayList usersList = new ArrayList();
        usersList.addAll(users.values());
        return usersList;
    }


    public Map getUsersAsMap() {

        return users;
    }


    public Collection getAllPortfolios() {

        ArrayList portfolios = new ArrayList();

        return portfolios;

    }


    public User getUser(String username) {

        User persistedUser = (User)users.get(username);
        return getModelCopy(persistedUser);

    }


    @Override
    public manning.utils.User getUser(Long id) {
        return null;
    }


    @Override
    public manning.utils.Portfolio getPortfolio(Long id) {
        return null;
    }


    public Portfolio getPortfolio(String username, String portfolioName) {

        User user = getUser(username);
        return (Portfolio)user.getPortfolios().iterator().next();

    }


    /* No real logic implemented */

    public String getDefaultUser() {

        Collection users = getUsers();
        Iterator iter = users.iterator();
        String defaultUsername = null;

        if (iter.hasNext()) {
            User user = (User)iter.next();
            defaultUsername = user.getUsername();
        }
        return defaultUsername;
    }


    @Override
    public boolean contains(manning.utils.User user) {
        return false;
    }


    @Override
    public void updatePortfolio(manning.utils.Portfolio port) {
    }

}
