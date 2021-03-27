package panda;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.*;

public class Examen {
    public static void main(String[] args) {

        //Ejercicio 1 Crea una variable para cada tipo de primitivo e imprime su valor en pantalla
        byte a = 5;
        short b = 10;
        int c = 15;
        long d = 20L;
        float e = 1.7885f;
        double f = 0.45854;
        boolean g = false;
        char h = 'h';

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);

        // Ejercicio 2 Haz dos ejemplos de cast explicito e imprime el resultado.

        String rfc = "MEDE881109";

        String numbers = rfc.substring(4,10);
        Long rfcNum = Long.parseLong(numbers);
        System.out.println(rfcNum);


        //Correccion
        double x = 1.25;
        int y = (int)x;

        int z = 300;
        short x1 = (short) z;


        // Ejercicio 3 Realiza dos ejemplos de cast implicito e imprime el resultado

        int exam = 6;
        int homework = 3;
        int calif = exam + homework;
        double caliFinal = calif;

        System.out.println("Tu calificación final es:" + caliFinal);

        //Correccion
        short sh = 129;
        int x2 = sh;

        int i1 = 1231654651;
        long l1 = i1;


        // Ejercicio 4 Que es una instancia? (Escribe la respuesta en un comentario multi linea)

        /* Es un objeto
        def: es un ejemplo de una clase

         */



        //5) Imprime tu nombre completo en pantalla

        System.out.println("Efrain Mena Delgado");

        //5.1) Imprimelo en minusculas.

        System.out.println("Efrain Mena Delgado".toLowerCase());

        //5.2) Imprimelo en mayusculas.

        System.out.println("Efrain Mena Delgado".toUpperCase());


        //5.3) Reemplaza todas las vocales 'a' de tu nombre por la letra 'x' e imprimelo

        System.out.println("Efrain Mena Delgado".replace('a','x'));

        //6) Crea un String con la frase "El examen esta pan", cuenta  e imprime el numero de caracteres en la frase.

        String xString = "El examen esta pan";
        int lenght = xString.length();
        System.out.println(lenght);


        //7) Calcula el IVA de un funko que cuesta $285.53, imprime en pantalla el precio, el IVA y el total

        BigDecimal price = BigDecimal.valueOf(285.53);
        BigDecimal toy2Price = BigDecimal.valueOf(300.47);
        BigDecimal charge = BigDecimal.valueOf(100);
        BigDecimal tax = BigDecimal.valueOf(0.16);
        BigDecimal iva = price.multiply(tax);
        price = price.add(iva);


        System.out.println(iva);
        System.out.println(price);


        //7.1) Con dos decimales

        System.out.println(price.setScale(2,RoundingMode.HALF_UP));

        //7.2) Sin decimales y redondeado

        System.out.println(price.setScale(0,RoundingMode.HALF_UP));


        //7.3) En una sola linea sumale el precio sin IVA de otro juguete y Restale $100 (Imprime el resultado con dos decimales)

        System.out.println(price.add(toy2Price).subtract(charge).setScale(2,RoundingMode.HALF_UP));


        //8) Tomando en cuenta que Cristiano Ronaldo nació el 5 de Febrero de 1985
        //8.1) Imprime en pantalla que dia de la semana cae su cumpleaños en el 2089

        LocalDate date = LocalDate.of(1985,2,5);
        LocalDate date2 = date.plusYears(104);
        System.out.println(date2.getDayOfWeek());

        //8.2) Restale 15 años a su fecha de nacimiento e imprime el resultado.

        LocalDate date3 = date.minusYears(15);
        System.out.println(date3);



        //10) Crea un tercer package con una clase llamada "TestClass"
        //        - Crea un metodo void
        //- Crea una instancia de "Calculator"
        //        - Inicializa la instancia con dos valores que tu quieras
        //- Haz un llamado al metodo "addition"
        //        - Crea otra instancia sin valores
        //- Llama al metodo "addition" enviando '7' como parametro

        //11) Usando un switch cuenta e imprime cuantas vocales a,e,i,o,u tiene la frase "Neta el examen estaba pan"
        //11.1) Imprime tambien cuantos caracteres no son vocales









    }

}
