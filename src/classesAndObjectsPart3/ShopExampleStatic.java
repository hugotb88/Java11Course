package classesAndObjectsPart3;

import java.math.BigDecimal;

public class ShopExampleStatic {

    public static void main(String[] args) {
        ProductExampleStatic.setExpiryPeriod(4);

        ProductExampleStatic p1 = new ProductExampleStatic();
        ProductExampleStatic p2 = new ProductExampleStatic();

        p1.setExpiryPeriod(2);
        p2.getExpiryPeriod();

        ProductExampleStatic p3 = new ProductExampleStatic();

        ProductExampleStatic.getExpiryPeriod();

        p1.getName();
        ProductExampleStatic.setExpiryPeriod(ProductExampleStatic.EXAMPLE);

//        ProductExampleStatic.getName();

    }

}
