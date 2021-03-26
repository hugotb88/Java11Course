package Galo;

import Calculator.Calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.Locale;


public class Examen {
    public static void main(String[] args) {

        //Ejercicio 1 - Definición de variables primitivas y asignación de valores
        byte a=3;
        short b=22;
        int c=100;
        int c_2=2;
        long d = 5648;
        float e = 25.36f;
        double f = 3732.69d;
        boolean g = true;
        char h = 'g';

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);

        //Ejercicio 2 - Casteo Explícito
        String i = String.valueOf(h);
        System.out.println(i);

        float sum =(float) (e + f);
        System.out.println(sum);

        //Ejercicio 3 - Casteo Implícito
        int j = a+b;
        System.out.println(j);

        double k = e/b;
        System.out.println(k);

        String l = "que perro está este " + a + "er ejercicio, pero me la pelan a " + c_2 + " manos";
        System.out.println(l);

        //Ejercicio 4 - Definición de instancia
        /*
        * Una instancia es una representación abstraccta de un objeto del mundo real,
        * con el cual podemos generar ejemplos de la clases de nuestro sistema. Al cual
        * le vamos a poder aplicar métodos.
        * */

        //Ejercicio 5 - Imprimir nombre
        String nombre = "Galo Aguirre González";
        System.out.println("Nombre: "+ nombre);
        //5.1 - Impreso en minúsculas
        System.out.println("Nombre en minúsculas: "+nombre.toLowerCase());
        //5.2 - Impreso en mayúsculas
        System.out.println("Nombre en mayúsculas: "+nombre.toUpperCase());
        //5.3 - Remplaza a por x
        System.out.println("Sustituye a por x: "+nombre.replace('a','x'));
        System.out.println("Sustituye a por x: "+nombre.toLowerCase().replace('a','x'));

        //Ejercicio 6 - Conteo de caracteres en String

        String frase = "El examen esta pan";
        System.out.println("La frase "+frase+ " tiene "+frase.length()+" caracteres.");

        //Ejercicio 7 - Calcula IVA
        BigDecimal price = BigDecimal.valueOf(285.53);
        System.out.println("El precio del Funko es: $"+price);
        //7.1 - Redondeamos el precio del IVA a 2 decimales
        BigDecimal iva = (price.multiply(BigDecimal.valueOf(0.16)).setScale(2, RoundingMode.UP));
        System.out.println("El IVA del Funko a 2 decimales es: $"+iva);
        //7.2 - Redondeado sin decimales
        BigDecimal iva_sd = iva.setScale(0,RoundingMode.UP);
        System.out.println("El IVA del Funko sin decimales es: $"+iva_sd);
        //7.3 - Suma de otro juguete sin iva - $100
        BigDecimal juguete_2 = BigDecimal.valueOf(746.99);
        BigDecimal res = (juguete_2.multiply(BigDecimal.valueOf(.16)).subtract(juguete_2).multiply(BigDecimal.valueOf(-1))).add(BigDecimal.valueOf(-100)).setScale(2,RoundingMode.HALF_UP);
        System.out.println("El resultado de sumar el precio sin IVA de otro juguete y restarle $100 es: $"+res);

        //Ejercicio 8
        int yy=2089;
        int mm = 2;
        int dd= 5;
        LocalDate cumpleRonaldo = LocalDate.of(yy,mm,dd);
        System.out.println("La fecha de nacimiento de CR7 es:"+ cumpleRonaldo);
        //8.1
        System.out.println("El cumpleaños de CR en el año 2089 cae el día:" + cumpleRonaldo.getDayOfWeek());
        //8.2 - Nacimiento de Ronaldo - 15 años
        LocalDate cumpleRonaldo_15 = LocalDate.of(yy-15,mm,dd);
        System.out.println("Fecha de nacimiento de CR - 15 años:"+cumpleRonaldo_15);

    }
}
