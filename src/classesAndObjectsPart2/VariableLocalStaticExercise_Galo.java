package classesAndObjectsPart2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class VariableLocalStaticExercise_Galo {
    public final static Double gravity = 9.81;
    public final static int two = 2;
    //Double vo;

    //Constructor
    public VariableLocalStaticExercise_Galo() {

    }

    //Methods
    public void calculateFinalVelocity(double time) {
        double finalVelocity = gravity * time;
        System.out.println("La velocidad final del objeto es: " + finalVelocity + "m/s.");
    }

    public void calculateFallDistance(double time) {
        double distance = (gravity * Math.pow(time, two)) / two;
        System.out.println("La altura de caida es de: " + distance + " m.");
    }

    public static void calculateTime(double distance) {
        double time = Math.sqrt((two * distance) / gravity);
        System.out.println("El tiempo de caida es: "+time+" s.");
    }

    public void calculateDistanceVerticalMovement(double velocity,double time){
        double seconds = time/60;
        BigDecimal high = BigDecimal.valueOf((velocity*seconds)+(gravity*(Math.pow(time,two)))/2).setScale(2, RoundingMode.HALF_UP);
        System.out.println("La distancia calculada del movimiento vertical hacia abajo es de: "+high+" m");
    }

    //Main
    public static void main(String[] args) {
        VariableLocalStaticExercise_Galo obj1 = new VariableLocalStaticExercise_Galo();

        obj1.calculateFallDistance(5.4);
        //Static Method
        calculateTime(10.65);
        obj1.calculateFinalVelocity(3.9);
        obj1.calculateDistanceVerticalMovement(95.44, 89.0);
    }
}
