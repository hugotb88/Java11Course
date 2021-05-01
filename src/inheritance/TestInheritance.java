package inheritance;

import java.time.LocalDate;

public class TestInheritance {
    public static void main(String[] args) {
        Person p1 = new Person("Efrain", LocalDate.of(1988,11,9));

        Client c1 = new Client(1,false,"Victor",LocalDate.of(1988,9,7));
        System.out.println(c1.getIdClient());
        System.out.println(c1.getName());
        System.out.println(c1.getDateOfBirth());
        System.out.println(c1.isVip());

        //Client c2 = (Client) new Person("Galo",LocalDate.of(1988,3,30));
        Person p2 = new Client(2,true,"Galo",LocalDate.of(1988,3,30));
    }
}
