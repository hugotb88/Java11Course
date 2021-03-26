package Calculator;

public class Calculator {
    Integer numberA, numberB;

    public Calculator(Integer n1, Integer n2) {
        numberA = n1;
        numberB = n2;
    }

    public Calculator() {
        numberA = 0;
        numberB = 0;
    }

    public void addition(Integer a1){
        int sum = a1 + numberA + numberB;
        System.out.println("Se van a sumar:"+a1+"+"+numberA+"+"+numberB);
        System.out.println("Resultado:"+sum);
    }
}
