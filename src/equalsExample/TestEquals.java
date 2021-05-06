package equalsExample;

public class TestEquals {

    public static void main(String[] args) {
        PersonEquals panda = new PersonEquals("Efrain","Mena",32);
        PersonEquals galo = new PersonEquals("Galo","Aguirre", 33);

        //Comparando dos objectos distintos sin Equals sobreescrito
        System.out.println(panda.equals(galo)); //false

        PersonEquals panda2 = new PersonEquals("Efrain","Mena",32);
        System.out.println(panda.equals(panda2)); //false

        panda2 = panda;
        System.out.println(panda.equals(null)); //true


        //Ya con Equals sobreescrito
        PersonEqualsImplemented panda1 = new PersonEqualsImplemented("Efrain","Mena",32);
        PersonEqualsImplemented panda4 = new PersonEqualsImplemented("Efrain","Mena",57);

        System.out.println(panda1.equals(panda4));




    }

}
