package manning.chapterFive;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;
import manning.chapterFive.utils.User;

/**
 * @author Alexandr Jelimalai
 */
public class DataTransferTest extends ActionSupport {

    private Double[] ages;
    private String[] names = new String[10];


    public Double[] getAges() {
        return ages;
    }


    public void setAges(Double[] ages) {
        this.ages = ages;
    }


    public String[] getNames() {
        return names;
    }


    public void setNames(String[] names) {
        this.names = names;
    }

    /* A list of names */

    private List lastNames;


    public List getLastNames() {
        return lastNames;
    }


    public void setLastNames(List lastNames) {
        this.lastNames = lastNames;
    }

    /* A list of middleNames */

    private List middleNames;


    public List getMiddleNames() {
        return middleNames;
    }


    public void setMiddleNames(List middleNames) {
        this.middleNames = middleNames;
    }

    private List weights;


    public List getWeights() {
        return weights;
    }


    public void setWeights(List weights) {
        this.weights = weights;
    }

    private List<User> users;


    public List<User> getUsers() {
        return users;
    }


    public void setUsers(List<User> users) {
        this.users = users;
    }


    @Override
    public String execute() throws Exception {
        return super.execute();
    }

    private Map maidenNames;


    public Map getMaidenNames() {
        return maidenNames;
    }


    public void setMaidenNames(Map maidenNames) {
        this.maidenNames = maidenNames;
    }

    private Map myUsers;


    public Map getMyUsers() {
        return myUsers;
    }


    public void setMyUsers(Map myUsers) {
        this.myUsers = myUsers;
    }

    private Map<Integer, User> myOrderedUsers;


    public Map<Integer, User> getMyOrderedUsers() {
        return myOrderedUsers;
    }


    public void setMyOrderedUsers(Map<Integer, User> myOrderedUsers) {
        this.myOrderedUsers = myOrderedUsers;
    }
}
