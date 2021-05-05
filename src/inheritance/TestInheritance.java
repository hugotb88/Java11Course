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

        Genero g1 = new Genero('M');
        Genero g2 = new Genero(3,true,"Rosa",LocalDate.of(1988,5,6),'M');
        Person p3 = new Genero('F');

        System.out.println(g1.getGenero());
        System.out.println("El Id es:" + g2.getIdClient()+". Su estatus de VIP es:"+g2.isVip()+". Su fecha de nacimiento es: "+g2.getDateOfBirth()+". Su género es: "+g2.getGenero());
//        System.out.println(p3.getGenero());
    }
}
