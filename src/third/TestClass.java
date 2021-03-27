package third;

import another.Calculator;

public class TestClass {
    public static void main(String[] args) {
        Calculator obj = new Calculator(5,10);
        obj.addition(3);

        Calculator obj2 = new Calculator();
        obj2.addition(7);
    }
}
