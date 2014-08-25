package manning.chapterFive;

import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import com.opensymphony.xwork2.conversion.TypeConversionException;

/**
 * @author Alexandr Jelimalai
 */
public class CircleTypeConverter extends StrutsTypeConverter {

    @Override
    public Object convertFromString(Map context, String[] values, Class toClass) {
        String userString = values[0];
        return parseCircle(userString);
    }


    private Circle parseCircle(String userString) {
        Circle circle = null;
        int radiusIndex = userString.indexOf('r') + 1;
        if (!userString.startsWith("C:r"))
            throw new TypeConversionException("Invalid Syntax");
        int radius;
        try {
            radius = Integer.parseInt(userString.substring(radiusIndex));
        } catch (NumberFormatException e) {
            throw new TypeConversionException("Invalid Value for Radius");
        }
        circle = new Circle();
        circle.setRadius(radius);
        return circle;
    }


    @Override
    public String convertToString(Map context, Object o) {
        Circle circle = (Circle)o;
        return "C:r" + circle.getRadius();
    }
}
