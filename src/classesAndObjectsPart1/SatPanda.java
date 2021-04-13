package classesAndObjectsPart1;

//Podrán ver nombre, edad, rfc y curp pero solo podran asignar nombre y edad

public class SatPanda {

    String name;
    Integer age;
    private String rfc;
    private String curp;

    //Constructores: son para definir como se crearan mis "SatPanda"
    public SatPanda(String assignedName, Integer assignedAge) {
        this.name = assignedName;
        this.age = assignedAge;
    }

    //Lo hago asi para que no lo puedan contruir fuera de esta clase
    private SatPanda(String assignedRfc, String assignedCurp){
        this.rfc = assignedRfc;
        this.curp = assignedCurp;
    }

    //Los set son para asignar los valores a cada objeto y el void es para que no me regrese nada solo lo haga y ya
    public void setName (String assignedName){
        this.name = assignedName;
    }

    public void setAge (Integer assignedAge){
        this.age = assignedAge;
    }

    private void setRfc (String assignedRfc){
        this.rfc= assignedRfc;
    }

    private void setCurp (String assignedCurp){
        this.curp= assignedCurp;
    }

    //Los get son para que regrese el valor asignado
    public String getName(){
        return this.name;
    }

    public Integer getAge(){
        return this.age;
    }

    public String getRfc(){
        return this.rfc;
    }

    public String getCurp(){
        return this.curp;
    }

    public static void main(String[] args) {

        //Prueba de que solo desde aqui asigno RFC y CURP
        SatPanda panda = new SatPanda("Efrain", 32);
        panda.setRfc("MEDE881109IG4");
        panda.setCurp("MEDE881109HDFNLF07");
        System.out.println(panda.getName());
        System.out.println(panda.getAge());
        System.out.println(panda.getRfc());
        System.out.println(panda.getCurp());





    }






}
