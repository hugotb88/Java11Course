package improvedClassDesignPart1;

public class ProductVariableNumberOfArguments {

    //Attributes
    private double price;

    //Constructors
    public ProductVariableNumberOfArguments(double price) {
        this.price = price;
    }

    public ProductVariableNumberOfArguments() {
    }


    //Methods with Variable Number of Parameters
    public void setPrice(double... possiblePrices){
        //Get the size of the array
        int lengthOfPossiblePrices = possiblePrices.length;

        if(lengthOfPossiblePrices <= 2){
            this.price = possiblePrices[0];
        }
        if(lengthOfPossiblePrices > 2 && lengthOfPossiblePrices < 6){
            this.price = possiblePrices[2];
        }


    }

    public void setAnotherPrice(double mainPrice, double... possiblePrices){
        //Get the size of the array
        int lengthOfPossiblePrices = possiblePrices.length;

        if(lengthOfPossiblePrices >= 1){
            this.price = possiblePrices[0];
        }else {
            this.price = mainPrice;
        }
    }


    public static void main(String[] args) {

        ProductVariableNumberOfArguments p1 = new ProductVariableNumberOfArguments();

        //Call the method
        p1.setPrice(10.20, 15.45, 16.80, 100.45, 1.15);


        //Fail Example
        ProductVariableNumberOfArguments p2 = new ProductVariableNumberOfArguments();

        //Call the method
        p2.setPrice(10.20, 15.45);


        p2.setAnotherPrice(40);

        p2.setAnotherPrice(40, 1, 2, 3, 4, 5);


    }

}
