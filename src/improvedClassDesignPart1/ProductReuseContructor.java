package improvedClassDesignPart1;

import java.math.BigDecimal;

public class ProductReuseContructor {

    //Attributes
    private String name;
    private BigDecimal price;

    //Contructors
    public ProductReuseContructor(String name, double price){
//        this.name = name;
        this(name);
        this.price = BigDecimal.valueOf(price);
    }

    public ProductReuseContructor(String name){
        this.name = name;

        System.out.println("A");
        System.out.println("A");
        System.out.println("A");
        System.out.println("A");
        System.out.println("A");
        System.out.println("A");
        System.out.println("A");
        System.out.println("A");
        System.out.println("A");
        System.out.println("A");
        System.out.println("A");
        System.out.println("A");
        System.out.println("A");

    }

    //Methods
    public void analyzeVocal(char vocal){
        switch (vocal) {
            case 'a':
                addConstantAtTheEnd("M");
                break;
            case 'e':
                addConstantAtTheEnd("N");
                break;
            case 'i':
                addConstantAtTheEnd("P");
                break;
            case 'o':
                addConstantAtTheEnd("Q");
                break;
            case 'u':
                addConstantAtTheEnd("S");
                break;
            default:
                System.out.println("Esto no es una vocal mamon");
        }
    }

    private void addConstantAtTheEnd(String constant){
        String result = this.name.concat(constant);
        this.name = result;
    }


    public static void main(String[] args) {
        ProductReuseContructor p1 = new ProductReuseContructor("Producto", 28.99);
        ProductReuseContructor p2 = new ProductReuseContructor("Producto", 28.99);
        ProductReuseContructor p3 = new ProductReuseContructor("Producto", 28.99);
        ProductReuseContructor p4 = new ProductReuseContructor("Producto", 28.99);
        ProductReuseContructor p5 = new ProductReuseContructor("Producto", 28.99);

        p1.analyzeVocal('a');
        p2.analyzeVocal('e');
        p3.analyzeVocal('i');
        p4.analyzeVocal('o');
        p5.analyzeVocal('u');


    }

}
