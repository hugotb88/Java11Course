package improvedClassDesignPart2;

import java.math.BigDecimal;

public class ProductImmutabilityExampleTwo {

    //Attributes
    private static int maxId = 0;
    private final int id;
    private final String name;
    private final BigDecimal price;

    //Instance initializer, executed every time we create an object
    {
        this.id = ++maxId;
    }

    //Contructors
    public ProductImmutabilityExampleTwo(String name) {
        this.name = name;
        this.price = BigDecimal.ZERO;
    }

    public ProductImmutabilityExampleTwo(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }




    //Methods
    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
