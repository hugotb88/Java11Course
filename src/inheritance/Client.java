package inheritance;

import java.time.LocalDate;

//extends implica que la clase Client va a heredar de Person
public class Client extends Person{
    private int idClient;
    private boolean isVip;

    public Client(){

    }
    //1st option
//    public Client(int idClient, boolean isVip, String nombre, LocalDate dateOfBirth){
//        this.idClient = idClient;
//        this.isVip = isVip;
//        this.setName(nombre);
//        this.setDateOfBirth(dateOfBirth);
//    }
    //2nd option
    public Client(int idClient, boolean isVip, String nombre, LocalDate dateOfBirth){
        super(nombre,dateOfBirth);//Llama al construtor de Person(clase padre)
        this.idClient = idClient;
        this.isVip = isVip;
    }

    public Client(String nombre, LocalDate dateOfBirth){
        super(nombre,dateOfBirth);//Llama al construtor de Person(clase padre)
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public boolean isVip() {
        return isVip;
    }

    public void setVip(boolean vip) {
        isVip = vip;
    }
}
