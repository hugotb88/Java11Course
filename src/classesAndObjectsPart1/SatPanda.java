package classesAndObjectsPart1;

//Podrán ver y
public class ExcerciseSatPanda {

    String name;
    Integer age;
    private String rfc;
    private String curp;

    public ExcerciseSatPanda(String assignedName, Integer assignedAge) {
        this.name = assignedName;
        this.age = assignedAge;
    }

    //Lo hago asi para que no se vea como se construye
    private ExcerciseSatPanda(String assignedRfc, String assignedCurp){
        this.rfc = assignedRfc;
        this.curp = assignedCurp;
    }

    
    //Estos son para que regrese el valor pedido
    public String getName(){
        return this.name;
    }

    public Integer getAge(){
        return this.age;
    }






}
