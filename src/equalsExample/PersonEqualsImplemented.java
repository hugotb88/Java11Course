package equalsExample;

public class PersonEqualsImplemented {

    //Attributes
    private String name;
    private String lastName;
    private int age;

    //Constructors
    public PersonEqualsImplemented() {
    }

    public PersonEqualsImplemented(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    //Methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public boolean equals(Object obj)
    {
        // checking if both the object references are
        // referring to the same object.
        if(this == obj)
            return true;

        // it checks if the argument is of the
        // type Geek by comparing the classes
        // of the passed argument and this object.
        // if(!(obj instanceof Geek)) return false; ---> avoid.
        if(obj == null || obj.getClass()!= this.getClass())
            return false;

        // type casting of the argument.
        PersonEqualsImplemented pei = (PersonEqualsImplemented) obj;

        // comparing the state of argument with
        // the state of 'this' Object.
        return (pei.name == this.name && pei.lastName == this.lastName && pei.age == this.age);
    }

}
