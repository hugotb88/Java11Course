package improvedClassDesignPart2;

import java.time.*;

public class EnumPanda{

    public enum country {
        MEX ("Mexico","MX", "Peso Mexicano", LocalDate.now(ZoneId.of("GMT-5"))),
        CHI ("Chile", "CHI", "Peso Chileno", LocalDate.now(ZoneId.of("GMT-4"))),
        ARG ("Argentina", "ARG", "Peso Argentino", LocalDate.now(ZoneId.of("GMT-3")));

      //  private static Object ARG(String argentina, String arg, String peso_argentino, LocalDate now) {        }

        private final String countryName;
        private final String abb;
        private final String coin;
        private final LocalDate zoneId;


        country(String countryName, String abbreviation, String coin, LocalDate zoneId) {
            this.countryName = countryName;
            this.abb = abbreviation;
            this.coin = coin;
            this.zoneId = zoneId;
        }

        public String getAll(){
            String result = "El nombre del pais es: " + countryName + " se le abrevia como " + abb + " usa la moneda " + coin + " y su zona horaria es " + zoneId;
            return result;
        }

        public static void main(String[] args) {
            System.out.println(MEX.getAll());
            System.out.println(CHI.getAll());
            System.out.println(ARG.getAll());
        }
    }
}



