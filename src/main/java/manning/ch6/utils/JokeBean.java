package manning.ch6.utils;

/*
 * This utility bean is used for the Struts 2 bean tag example. This bean only conforms to the JavaBeans standards by providing a no-argument constructor and a
 * JavaBeans property that will receive a parameter from the tag to control the joke type. The utility method actually doesn't conform to JavaBeans standards,
 * but the framework can still make use of it due to the ability of the OGNL expression language to invoke methods.
 */

public class JokeBean {

    public String startAJoke() {

        String openingLine = "pigs";

        if (jokeType.equals("knockknock"))
            openingLine = "knockknock";
        else if (jokeType.equals("adult"))
            openingLine = "A dog, a cat, and a canary walk into a bar . . .";
        else
            openingLine = "That's not funny.";

        return openingLine;
    }

    /* JavaBeans property to receive the parameter from the tag. */

    private String jokeType = "default";


    public String getJokeType() {
        return jokeType;
    }


    public void setJokeType(String type) {
        this.jokeType = type;
    }

}
