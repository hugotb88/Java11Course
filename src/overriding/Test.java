package overriding;

public class Test {

    public static void main(String[] args) {
        Panda p1 = new Panda();
        p1.hello();


        Galo g1 = new Galo();
        g1.hello();


        Panda p2 = new Galo();
        p2.hello();


        System.out.println(p1.toString());
        System.out.println(g1.toString());
        System.out.println(p2.toString());

    }

}
