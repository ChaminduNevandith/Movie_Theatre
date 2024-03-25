
public class Ticket {

    int row;
    int seat;
    double price;
    Person person;

    public int getRow() {

        return this.row;
    }
    public int getSeat() {

        return this.seat;
    }

    public double getPrice() {

        return this.price;
    }



    public Ticket(int row, int seat, double price, Person person) {
        this.row = row;
        this.seat = seat;
        this.price = price;
        this.person = person;
    }
    public  void print(){
        System.out.println("person name:"+ this.person.getName()+"  "+this.person.getSurname());
        System.out.println("email :"+ this.person.getEmail());
        System.out.println("Row Number :"+getRow());
        System.out.println("seat Number :"+getSeat());
        System.out.println("price: "+getPrice());
        System.out.println(  );
    }
    public Person getPerson() {

        return this.person;
    }










}
