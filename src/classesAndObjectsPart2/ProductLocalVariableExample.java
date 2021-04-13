package classesAndObjectsPart2;

public class ProductLocalVariableExample {

    private String name;

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

    public void inferenceLocalVariableExample (int param){
        var value1 = "Hello"; //Since Java 10, Java infers this is a Stirng
        var value2 = param; //And infers this is an int
    }
}
