package classesAndObjectsPart3;

import java.time.Period;

public class ProductExampleStatic {

    //Attributes or Instance Variables
    private static Period defaultExpiryPeriod;
    private String name;

    //Constant with final and static
    public final static int EXAMPLE = 3;


    //static code, executed after the class is created
    static {
        defaultExpiryPeriod = Period.ofDays(3);
    }

    //Static Methods
    public static Period getExpiryPeriod() {
        return defaultExpiryPeriod;
    }

    public static void setExpiryPeriod(int days) {
        defaultExpiryPeriod = Period.ofDays(days);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
