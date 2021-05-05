package inheritance;

import java.time.LocalDate;

public class Genero extends Client{
    private char genero;

    public Genero(){

    }

    public Genero(char genero){
        this.genero = genero;
    }

    public Genero(int idClient, boolean isVip, String nombre, LocalDate dateOfBirth, char genero){
        super(idClient,isVip,nombre,dateOfBirth);
        this.genero = genero;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
}
