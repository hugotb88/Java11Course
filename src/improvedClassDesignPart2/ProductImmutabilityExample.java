package improvedClassDesignPart2;

import java.math.BigDecimal;

public class ProductImmutabilityExample {

    //Attributes
    private String name;
    private BigDecimal price;

    //Contructors
    public ProductImmutabilityExample(String name) {
        this.name = name;
    }

    public ProductImmutabilityExample(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    //Methods
    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
