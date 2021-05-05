package overriding;

public class Panda {

    public void hello(){
        System.out.println("Hola, soy el Panda, y esto es Disney Channel");
    }


    @Override
    public String toString() {
        return "Soy un Objeto Panda y tengo estos atributos" ;
    }
}
