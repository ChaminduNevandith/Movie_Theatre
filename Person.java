

public class Person {
    String name;
    String surname;
    String email;


    public  String getName() {
        return this.name;
    }
    public  String getSurname() {
        return this.surname;
    }
    public  String getEmail() {
        return this.email;
    }

    public Person(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

}

