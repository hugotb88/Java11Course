package textDateTime3;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

        /*
        1) Convert to GB and MX the next values for:
         - currency
         - percentage
         - quantity
         The values are:
         - 1800 (Currency)
         - 56.89 (percentage)
         - 536748
        */

public class ExerciseTextDateTimePanda {
    public static void main(String[] args) {

        //Declaro los valores a "formatear"
        BigDecimal currency = BigDecimal.valueOf(1800);
        Double tax = 56.89;
        int quantity = 536748;

        // Codigo para declarar el pais e idioma al que vamos a formatear en - GB
        Locale localGb = new Locale("en", "GB");

        //Creamos instancias de moneda, impuesto y cantidad
        NumberFormat currencyFormatGb = NumberFormat.getCurrencyInstance(localGb);
        NumberFormat taxFormatGb = NumberFormat.getPercentInstance(localGb);
        NumberFormat quantityFormatGb = NumberFormat.getNumberInstance(localGb);

        //Le damos el formato en el idioma y pais en que están esas monedas, impuestos y cantidades
        String formattedPriceGb = currencyFormatGb.format(currency);
        String formattedTaxGb = taxFormatGb.format(tax);
        String formattedQuantityGb = quantityFormatGb.format(quantity);

        System.out.println(formattedPriceGb);
        System.out.println(formattedTaxGb);
        System.out.println(formattedQuantityGb);

        //Como lo regreso a su Wrapper o Primitivo??
        //BigDecimal newPriceGB = (BigDecimal)currencyFormatGb.parse("formattedPriceGb");   ** no corrio
        //Double newTaxGb = (Double)taxFormatGb.parse("formattedTaxGB");
        //int newQuantityGB = quantityFormatGb.parse("formattedQuantityGb").intValue();

        //System.out.println(newPriceGB);
        //System.out.println(newTaxGb);
        //System.out.println(newQuantityGB);

        // Codigo para es - MX
        Locale localMx = new Locale("es", "MX");

        NumberFormat currencyFormatMx = NumberFormat.getCurrencyInstance(localMx);
        NumberFormat taxFormatMx = NumberFormat.getPercentInstance(localMx);
        NumberFormat quantityFormatMx = NumberFormat.getNumberInstance(localMx);

        String formattedPriceMx = currencyFormatMx.format(currency);
        String formattedTaxMx = taxFormatMx.format(tax);
        String formattedQuantityMx = quantityFormatMx.format(quantity);

        System.out.println(formattedPriceMx);
        System.out.println(formattedTaxMx);
        System.out.println(formattedQuantityMx);








    }
}
