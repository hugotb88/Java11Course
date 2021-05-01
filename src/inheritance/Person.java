package inheritance;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate dateOfBirth;

    public Person(){
    }

    public Person(String name, LocalDate dateOfBrith){
        this.name = name;
        this.dateOfBirth = dateOfBrith;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
