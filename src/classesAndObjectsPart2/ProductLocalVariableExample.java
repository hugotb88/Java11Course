package classesAndObjectsPart2;

public class ProductLocalVariableExample {

    private String name;
    public final Double PI = 3.14;

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        if(name == null){
            String dummy = "Unknown";
            return dummy;
        }
        return name;
    }

    public String consume(){
        String feedback = "Good!";
        return feedback;
    }

    public String createRFC(String curp){
        String rfc = "";

        String iniciales = curp.substring(0,4);
        String fechaNacimiento = curp.substring(4,10);
        String homoclave = "PT9";

        rfc = iniciales + fechaNacimiento + homoclave;

        return rfc;
    }




    public void inferenceLocalVariableExample (int param){
        var value1 = "Hello"; //Since Java 10, Java infers this is a Stirng
        var value2 = param; //And infers this is an int
    }


    public static void main(String[] args) {
        ProductLocalVariableExample p1 = new ProductLocalVariableExample();
        ProductLocalVariableExample p2 = new ProductLocalVariableExample();

        p1.setName("tea");
        p2.setName("cake");

        String resultGetP1 = p1.getName();
        String resultGetP2 = p2.getName();

        String resultconsumeP1 = p1.consume();
        String resultconsumeP2 = p2.consume();

        p1.createRFC("OECV880907");

        //Uso de constante
        System.out.println(p1.PI);
    }
}
