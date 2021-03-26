package SwtichTest;

public class SwitchTest {
    public static void main(String[] args) {

        //Ejercicio 11
        String frase2 = "Neta el examen estaba pan";
        int lf = frase2.length()-1;
        System.out.println(lf);
        int cont_a = 0, cont_e = 0, cont_i = 0, cont_o = 0, cont_u = 0;
        int cont_c = 0, cont_s = 0;
        for (int cont = 0; cont <= lf; ++cont) {
            char x = frase2.charAt(cont);
            switch (x) {
                case 'a':
                    ++cont_a;
                    break;
                case 'e':
                    ++cont_e;
                    break;
                case 'i':
                    ++cont_i;
                    break;
                case 'o':
                    ++cont_o;
                    break;
                case 'u':
                    ++cont_u;
                    break;
                case ' ':
                    ++cont_s;
                    break;
                default:
                    ++cont_c;
                    break;
            }
        }
        System.out.println("Se encontraron las siguientes letras a: " + cont_a);
        System.out.println("Se encontraron las siguientes letras e: " + cont_e);
        System.out.println("Se encontraron las siguientes letras i: " + cont_i);
        System.out.println("Se encontraron las siguientes letras o: " + cont_o);
        System.out.println("Se encontraron las siguientes letras u: " + cont_u);
        System.out.println("Se encontraron las siguientes consonantes: " + cont_c);
        System.out.println("Se encontraron los siguientes espacios: " + cont_s);
    }
}
