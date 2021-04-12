package classesAndObjectsPart1;

import java.util.Locale;

public class ExcerciseClasses_Gallo {

    private String name;
    private String lastName;
    private int op;

    //Constructors
    public ExcerciseClasses_Gallo(String nombre, String apellido) {
        this.name = nombre;
        this.lastName = apellido;
    }

    public ExcerciseClasses_Gallo(String nombre) {
        this.name = nombre;
    }

    public ExcerciseClasses_Gallo() {

    }

    public String getName() {
        return name;
    }

    public void setName(String nombre) {
        this.name = nombre;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String apellido) {
        this.lastName = apellido;
    }
    //Methods
    /*public void createPerson(int opc){
        System.out.println("Selecciona una opción:");
        System.out.println("1. Persona con nombre y apellido");
        System.out.println("2. Persona solo el nombre");
        switch (op){
            case 1:
                System.out.printf("Da un nombre:");
                setName(name);
                System.out.printf("Da un apellido:");
                setLastName(lastName);
                ExcerciseClasses_Gallo person1 = new ExcerciseClasses_Gallo(name,lastName);
                System.out.println(person1);
                break;
            case 2:
                System.out.printf("Da un nombre:");
                setName(name);
                ExcerciseClasses_Gallo person2 = new ExcerciseClasses_Gallo(name);
                System.out.println(person2);
                break;
        }
    }*/

    public void concatenaNombre() {
        String nombreConcat = name.concat(lastName);
        System.out.println(nombreConcat);
    }

    public void nombreMayusculas() {
        String nameMayus = name.toUpperCase(Locale.ROOT);
        String lastNameMayus = lastName.toUpperCase(Locale.ROOT);
        System.out.println(nameMayus + " " + lastNameMayus);
    }

    public void nombreMinusculas() {
        String nameMinus = name.toLowerCase();
        String lastNameMinus = lastName.toLowerCase();
        System.out.println(nameMinus + " " + lastNameMinus);
    }

    public void invierteNombre() {
        StringBuilder nameInverted = new StringBuilder(name.concat(" ").concat(lastName));
        nameInverted.reverse();
        System.out.println(nameInverted);
    }
}
