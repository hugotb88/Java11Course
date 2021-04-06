package textDateTime3;

import java.util.Locale;
import java.util.ResourceBundle;

public class bundleExample {

    public static void main(String[] args) {

        Locale locale = new Locale("en","GB");
        ResourceBundle bundle = ResourceBundle.getBundle("messages", locale);
        String hello = bundle.getString("hello");
        String other = bundle.getString("other");

        System.out.println(hello);
        System.out.println(other);

    }
}
