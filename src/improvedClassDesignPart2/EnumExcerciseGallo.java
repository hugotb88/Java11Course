package improvedClassDesignPart2;

public enum EnumExcerciseGallo {
    MEXICO("Mexico", "MEX", "Peso Mexicano", "MXN"),
    CROATIA("Croacia", "CRO", "Kuna", "HRK"),
    DENMARK("Dinamarca", "DEN", "Corona Danesa", "DKK");

    private final String countryName;
    private final String countyAbbr;
    private final String currencyName;
    private final String currencyAbbr;

    EnumExcerciseGallo(String countryName, String countyAbbr, String currencyName, String currencyAbbr) {
        this.countryName = countryName;
        this.countyAbbr = countyAbbr;
        this.currencyName = currencyName;
        this.currencyAbbr = currencyAbbr;
    }

    public void getCountrySummary() {
        System.out.println("A " + countryName + " se le abrevia como " + countyAbbr + " en base al COI. " +
                "Tiene una moneda llamada " + currencyName + " la cual según el código ISO 4217 se le conoce como "
                + currencyAbbr+".");
    }

    /*public String getAbbreviatedName() {
        return abbr;
    }

    public boolean isOriginalColony(){
        return originalColony;
    }*/
}

