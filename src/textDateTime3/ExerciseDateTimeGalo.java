package textDateTime3;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class ExerciseDateTimeGalo {
    public static void main(String[] args) {
        BigDecimal currency = BigDecimal.valueOf(1800);
        float percentage = 56.89f;
        int quantity = 536748;

        Locale local1 = new Locale("es-419","MX");
        Locale local2 = new Locale("en","GB");

        NumberFormat currencyFormat1 = NumberFormat.getCurrencyInstance(local1);
        NumberFormat percentageFormat1 = NumberFormat.getPercentInstance(local1);
        NumberFormat quantityFormat1 = NumberFormat.getNumberInstance(local1);

        NumberFormat currencyFormat2 = NumberFormat.getCurrencyInstance(local2);
        NumberFormat percentageFormat2 = NumberFormat.getPercentInstance(local2);
        NumberFormat quantityFormat2 = NumberFormat.getNumberInstance(local2);

        String formattedCurrency1 = currencyFormat1.format(currency);
        String formattedPercentage1 = percentageFormat1.format(percentage);
        String formattedQuantity1 = quantityFormat1.format(quantity);

        String formattedCurrency2 = currencyFormat2.format(currency);
        String formattedPercentage2 = percentageFormat2.format(percentage);
        String formattedQuantity2 = quantityFormat2.format(quantity);

        System.out.println("El precio en pesos mexicanos es: "+formattedCurrency1);
        System.out.println("El precio en libras esterlinas es: "+formattedCurrency2);
        System.out.println("El porcentaje expresado en MX es: "+formattedPercentage1);
        System.out.println("El porcentaje expresado en GB es: "+formattedPercentage2);
        System.out.println("Una cantidad expresada en MX es: "+formattedQuantity1);
        System.out.println("Una cantidad expresada en GB es: "+formattedQuantity2);
    }
}
