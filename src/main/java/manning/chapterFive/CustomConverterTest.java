package manning.chapterFive;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Alexandr Jelimalai
 */
public class CustomConverterTest extends ActionSupport {

    private Circle circle;


    public Circle getCircle() {
        return circle;
    }


    public void setCircle(Circle circle) {
        this.circle = circle;
    }


    @Override
    public String execute() throws Exception {
        return super.execute();
    }
}
