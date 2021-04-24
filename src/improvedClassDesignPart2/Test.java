package improvedClassDesignPart2;

import java.math.BigDecimal;

public class Test {

    public static void main(String[] args) {
        //Object immutable example 1
        ProductImmutabilityExample p1 = new ProductImmutabilityExample("Doritos", BigDecimal.valueOf(13));

        //Object immutable example 2
        ProductImmutabilityExampleTwo p2 = new ProductImmutabilityExampleTwo("Doritos", BigDecimal.valueOf(13));
        ProductImmutabilityExampleTwo p3 = new ProductImmutabilityExampleTwo("Rancheritos", BigDecimal.valueOf(13));
        ProductImmutabilityExampleTwo p4 = new ProductImmutabilityExampleTwo("Chetos", BigDecimal.valueOf(13));
        ProductImmutabilityExampleTwo p5 = new ProductImmutabilityExampleTwo("Sabritas Limon", BigDecimal.valueOf(13));

    }
}
