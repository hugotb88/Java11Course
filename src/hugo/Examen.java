package hugo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.Month;
import java.util.Locale;

public class Examen {

    public static void main(String[] args) {
        //Ejercicio 1
        boolean bool = true;
        char c = 'h';
        byte b = 001;
        short s = 100;
        int i = 1;
        long l = 2L;
        float f = 1.5f;
        double d = 5.4;

        System.out.println(bool);
        System.out.println(c);
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);


        //Ejercicio 2
        double d1 = 500.08;
        int i1 = (int) d1;

        long l1 = 2000L;
        short s1 = (short) l1;

        System.out.println(i1);
        System.out.println(s1);


        //Ejercicio 3
        int in2 = 100;
        long l2 = in2;
        System.out.println(in2);

        float f1 = 10.08f;
        double d2 = f1;
        System.out.println(d2);

        //Ejercicio 4
        /**
         * Es un ejemplo de una clase, es lo mismo que objeto
         * */

        //Ejercicio 5
        String nombre = "Victor Hugo Olvera Cruz";
        System.out.println(nombre);
        System.out.println(nombre.toUpperCase(Locale.ROOT));
        System.out.println(nombre.toLowerCase(Locale.ROOT));
        System.out.println(nombre.replaceAll("a","x"));

        //Ejercicio 6
        String algo = "El examen esta pan";
        Integer numberOfA = algo.length();
        System.out.println(numberOfA);

        //Ejercicio 7
        BigDecimal funko = BigDecimal.valueOf(285.53);
        BigDecimal iva = BigDecimal.valueOf(0.16);
        BigDecimal ivaTotal = funko.multiply(iva);
        BigDecimal total = funko.add(ivaTotal);
        System.out.println(funko);
        System.out.println(ivaTotal);
        System.out.println(total.setScale(2,RoundingMode.UP));
        System.out.println(total.setScale(0, RoundingMode.HALF_UP));

        System.out.println(total.add(BigDecimal.valueOf(50)).subtract(BigDecimal.valueOf(100)).setScale(2,RoundingMode.UP));

        //Ejercicio 8
        LocalDate cr7Birthday = LocalDate.of(1985, Month.FEBRUARY,5);
        Integer yearsTo2089 = 2089-1985;
        System.out.println(cr7Birthday.plusYears(yearsTo2089).getDayOfWeek());

        System.out.println(cr7Birthday.plusYears(15));


        //Ejercicio 11
        String phrase = "Neta el examen estaba pan";

        





    }
}
