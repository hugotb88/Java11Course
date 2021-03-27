package another;

public class Calculator {

    //Attributes
    Integer numberA;
    Integer numberB;

    //Constructor
    public Calculator(Integer num1, Integer num2){
        this.numberA = num1;
        this.numberB = num2;
    }

    public Calculator(){
        this.numberA = 0;
        this.numberB = 0;
    }


    //Methods
    public void addition(Integer number){
        Integer res = this.numberA + this.numberB + number;
        System.out.println(res);
//        System.out.println(this.numberA + this.numberB + number);
    }


}
