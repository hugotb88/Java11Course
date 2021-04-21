package improvedClassDesignPart1;

import classesAndObjectsPart3.ProductExampleStatic;

import java.math.BigDecimal;

public class ProductOverloading {

    //Attributes
    private BigDecimal finalPrice;


    //Constructor
    public ProductOverloading(BigDecimal finalPrice) {
        this.finalPrice = finalPrice;
    }

    public ProductOverloading() {
    }

    //Overloading methods examples
    public BigDecimal setFinalPrice (BigDecimal finalPrice){
        this.finalPrice = finalPrice;
        return this.finalPrice;
    }

    //Sending 2 parameters, same method name
    public BigDecimal setFinalPrice( BigDecimal finalPrice, BigDecimal tax){
        BigDecimal result =  ( finalPrice.multiply(tax) ).add(finalPrice);
        this.finalPrice = result;
        return result;
    }

    //Receiving different types of parameters
    public BigDecimal setFinalPrice(BigDecimal finalPrice, double tax) {
        //Convert tax to BigDecimal
        BigDecimal taxBigDecimal = BigDecimal.valueOf(tax);

        BigDecimal result = (finalPrice.multiply(taxBigDecimal)).add(finalPrice);

        this.finalPrice = result;
        return result;
    }


    public static void main(String[] args) {

        ProductOverloading p1 = new ProductOverloading();
        ProductOverloading p2 = new ProductOverloading();
        ProductOverloading p3 = new ProductOverloading();

        //Using first method with p1
        p1.setFinalPrice(BigDecimal.valueOf(25l));

        //Using second method with p2
        BigDecimal finalPriceWithTwoParameters = p2.setFinalPrice(BigDecimal.valueOf(30l), BigDecimal.valueOf(10l));


        //Using third method with p3
        BigDecimal finalPriceWithTwoDifferentParameters = p3.setFinalPrice(BigDecimal.valueOf(30l), 16.00);

    }
}
