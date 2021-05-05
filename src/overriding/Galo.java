package overriding;

public class Galo extends Panda{

    @Override
    public void hello(){
        System.out.println("Hola, soy Galo y no hago tarea.");
    }

    @Override
    public String toString() {
        return "Galo{}";
    }
}
