package classesAndObjectsPart2;

import java.util.Random;

public class ExcercisePanda {

    public final static String hclave = "NLF";
    public final static String state = "DF";
    public String name;
    public String lastName;
    public String lastName2;
    public String birthDay;
    public String birthMonth;
    public Integer birthYear;

    //Constructor para que construya objetos con todos esos datos que se requieren para el curp
    public ExcercisePanda(String assignedName, String assignedLastName, String assignedLastName2, String assignedBirthDay,
                    String assignedBirthMonth, Integer assignedBirthYear) {
        this.name = assignedName;
        this.lastName = assignedLastName;
        this.lastName2 = assignedLastName2;
        this.birthDay = assignedBirthDay;
        this.birthMonth = assignedBirthMonth;
        this.birthYear = assignedBirthYear;
    }

    // Set y Get de mis variables
    public void setName (String assignedName) {
        this.name = assignedName;
    }
    public String getName(){
        return this.name;
    }

    public void setLastName (String assignedLastName) {
        this.lastName = assignedLastName;
    }
    public String getLastName(){
        return this.lastName;
    }

    public void setLastName2(String assignedLastName2) {
        this.lastName2 = assignedLastName2;
    }
    public String getLastName2(){
        return this.lastName2;
    }

    public void setBirthDay(String assignedBirthDay) {
        this.birthDay = assignedBirthDay;
    }
    public String getBirthday(){
        return this.birthDay;
    }

    public void setBirthMonth(String assignedBirthMonth) {
        this.birthMonth = assignedBirthMonth;
    }
    public String getBirthMonth(){
        return this.birthMonth;
    }

    public void setBirthYear(Integer assignedBirthYear) {
        this.birthYear = assignedBirthYear;
    }
    public Integer getBirthYear(){
        return this.birthYear;
    }

    //Metodo para traerme las 2 primeras letras del apellido
     public String letLastName(){
        String letterLastName = lastName.substring(0,2).toUpperCase();
        return letterLastName;
    }

    //Metodo para traerme la primera letra del nombre
    public String letterNombre() {
        String letterName = name.substring(0,1).toUpperCase();
        return letterName;
    }

    //Metodo para traerme la primera letra del segundo apellido
    public String lettLastName2() {
        String letterLName2 = lastName2.substring(0,1).toUpperCase();
        return letterLName2;
    }
    //Metodo para traerme los 2 ultimos digitos del año
    public String numBirthYear() {
        String numYear = birthYear.toString().substring(2,4);
        return numYear;
    }

    //Metodo para traerme los ultimos digitos del Curp
    public int claveCurp(){
        Random code =  new Random();
        int clave = code.nextInt(100);
        return clave;
    }


    public static void main(String[] args) {
        ExcercisePanda people1 = new ExcercisePanda("efrain", "mena", "delgado", "09" , "11", 1988);
        System.out.println("Tu CURP es: " + people1.letLastName() + people1.lettLastName2() + people1.letterNombre() + people1.numBirthYear()
                + people1.getBirthMonth() + people1.getBirthday() + state + hclave + people1.claveCurp());





    }























}
