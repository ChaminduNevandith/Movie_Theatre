
import java.io.FileWriter;
import java.util.*;
import java.io.File;
import java.io.IOException;

public class Theatre {

    // creating variable
    static int[] fRow = new int[12];
    static int[] sRow = new int[16];
    static int[] tRow = new int[20];
    static int seatNumber = 0;
    static int rowNumber = 0;
    static double price;
    static String name;
    static String surname;
    static String email;
    static ArrayList<Ticket>ticket=new ArrayList<>();


    // main method
    public static void main(String[] args) {

        System.out.println("Welcome to the New Theatre");

        // print three arrays
        // first array
        System.out.print("Row 1: ");
        for (int i = 0; i < fRow.length; i++) {
            System.out.print(fRow[i]);
        }
        // second array
        System.out.println();
        System.out.print("Row 2: ");
        for (int j = 0; j < sRow.length; j++) {
            System.out.print(sRow[j]);
        }
        //third array
        System.out.println();
        System.out.print("Row 3: ");
        for (int a = 0; a < tRow.length; a++) {
            System.out.print(tRow[a]);
        }

        System.out.println();

        // quit true it will exit the program
        boolean quit = false;

        // print menu options
        while (!quit) {

            System.out.println( );
            System.out.println("-------Welcome to the Theatre--------");
            System.out.print("-------------------------------------------------");
            System.out.println("\n" + "* MENU *");
            System.out.println("1)  Buy a ticket");
            System.out.println("2)  Print seating area");
            System.out.println("3)  Cancel ticket");
            System.out.println("4)  List available seats");
            System.out.println("5)  Save to file ");
            System.out.println("6)  Load from file  ");
            System.out.println("7)  Print ticket information and total price");
            System.out.println("8)  Sort tickets by price ");
            System.out.println("        0)  Quit");
            System.out.println("--------------------------------------------------");

            int option = 0;

            while (true) {
                try {
                    Scanner input = new Scanner(System.in);
                    System.out.print("\n" + "Choose an option: ");
                    option = input.nextInt();
                    break;
                } catch (InputMismatchException a) {
                    System.out.print("invalid option ");
                }

            }

            // switch case used to call method when user input option

            switch (option) {
                case 1:
                    Buy_Ticket();
                    break;
                case 2:
                    print_seating_area();
                    break;
                case 3:
                    cancel_ticket();
                    break;
                case 4:
                    show_available();
                    break;
                case 5:
                    save();
                    break;
                case 6:
                    load();
                    break;
                case 7:
                    showTicketsInfo();
                    break;
                case 8:
                    sortTickets();
                    break;
                case 0:
                    quit = true;
                    break;
                default:
                    System.out.println("Incorrect option.");
            }
        }


    }
    // buy ticket method
    public static void Buy_Ticket() {

        // get input from the user
        Scanner input = new Scanner(System.in);
        {
            // get row number and check validation
            while(true){
                try{
                    System.out.print("Enter Row Number :");
                    rowNumber = input.nextInt();
                    break;
                }catch(InputMismatchException e){
                    System.out.print("Invalid Row Number ");
                    System.out.println(" ");
                    input.next();
                }
            }
            // get seat number and check validation
            while(true){
                try{
                    System.out.print("Enter seat NUmber :");
                    seatNumber = input.nextInt();
                    break;
                }catch(InputMismatchException e){
                    System.out.print("Invalid seat Number ");
                    System.out.println(" ");
                    input.next();
                }
            }

            // get name
            System.out.print("Please enter your name: ");
            name = input.next();
            System.out.print("");

            //get surname
            System.out.print("Please enter your surname : ");
            surname = input.next();
            System.out.print("");

            //get email
            System.out.print("Please enter your email : ");
            email = input.next();
            System.out.print("");

            /* if user choose row number 1 price will be 100.
            if user choose row number 2 price will be 200.
            user choose 3 price will be 250. */

            if(rowNumber==1){
                price=100;
            } else if(rowNumber==2){
                price=200;
            }else if(rowNumber==3){
                price=250;
            }


            if (rowNumber == 1 && seatNumber >= 1 && seatNumber <= 12 && Theatre.fRow[seatNumber - 1] == 0) {
                fRow[seatNumber - 1] = 1;
                System.out.print("in row Number "+rowNumber+" "+"seat number "+seatNumber+" booked " + "\n");
                object();


            } else if (rowNumber == 2 && seatNumber >= 1 && seatNumber <= 16 && Theatre.sRow[seatNumber - 1] == 0) {
                sRow[seatNumber - 1] = 1;
                System.out.print("in row Number "+rowNumber+" "+"seat number "+seatNumber+" booked " + "\n");
                object();

            } else if (rowNumber == 3 && seatNumber >= 1 && seatNumber <= 20 && Theatre.tRow[seatNumber - 1] == 0) {
                tRow[seatNumber - 1] = 1;
                System.out.print("in row Number "+rowNumber+" "+"seat number "+seatNumber+" booked " + "\n");
                object();

            } else {
                System.out.print("Invalid or seat already booked ");
                System.out.println( );

            }

        }
    }
    // object method
    public static void object(){
        Person person= new Person(name,surname,email);
        Ticket Ticket= new Ticket(rowNumber,seatNumber,price,person);
        // row number, seat number , price and person information add to ticket array list
        ticket.add(Ticket);
    }


    //print seat area  method
    public static void print_seating_area() {


        System.out.println(" ");
        System.out.println("     ***********");
        System.out.println("     *  STAGE  *");
        System.out.println("     ***********");
        System.out.print("    ");

        // OOOOOO OOOOOO
        for (int i = 0;i<fRow.length; i++) {
            if (fRow[i] == 1){
                System.out.print("X");
            } else if (fRow[i] == 0){
                System.out.print("O");
            }
            if(i==5){
                System.out.print(" ");
            }
        }
        // OOOOOOOO OOOOOOOO
        System.out.println();
        System.out.print("  ");
        for (int i = 0; i<sRow.length; i++) {
            if (sRow[i] == 1){
                System.out.print("X");
            } else if (sRow[i] == 0){
                System.out.print("O");
            }
            if(i==7){
                System.out.print(" ");
            }
        }
        // OOOOOOOOOO OOOOOOOOOO
        System.out.println();
        System.out.print("");
        for (int i = 0; i<tRow.length; i++) {
            if (tRow[i] == 1){
                System.out.print("X");
            } else if (tRow[i] == 0){
                System.out.print("O");
            }
            if(i==9){
                System.out.print(" ");
            }
        }
        System.out.println();
    }




    // cancel ticket method
    public static void cancel_ticket() {
        Scanner input = new Scanner(System.in);
        {
            // get row number and check validation
            while(true){
                try{
                    System.out.print("Enter Row Number :");
                    rowNumber = input.nextInt();
                    break;
                }catch(InputMismatchException e){
                    System.out.print("Invalid Row Number ");
                    System.out.println(" ");
                    input.next();
                }
            }
            // get seat number and check validation
            while(true){
                try{
                    System.out.print("Enter seat NUmber :");
                    seatNumber = input.nextInt();
                    break;
                }catch(InputMismatchException e){
                    System.out.print("Invalid seat Number ");
                    System.out.println(" ");
                    input.next();
                }
            }
            if (rowNumber == 1 && seatNumber >= 1 && seatNumber <= 12 && fRow[seatNumber - 1] == 1 ) {
                System.out.println("ticket canceled");
                fRow[seatNumber-1] = 0;
                removeArray();
            } else if (rowNumber == 2 && seatNumber >= 1 && seatNumber <= 16 && sRow[seatNumber - 1] == 1) {
                System.out.println("ticket canceled");
                sRow[seatNumber - 1] = 0;
                removeArray();
            } else if (rowNumber == 3 && seatNumber >= 1 && seatNumber <= 20 && tRow[seatNumber - 1] == 1) {
                System.out.println("ticket canceled");
                tRow[seatNumber - 1] = 0;
                removeArray();
            } else {
                System.out.println("invalid input or Seat need to book");
            }

        }
    }

    // row number and seat number same to get row number and get seat number . inforamtion will remove from the array
    public static void removeArray(){
        for (Ticket t:ticket) {
            if (t.getRow() == rowNumber && t.getSeat() == seatNumber) {
                ticket.remove(t);
                System.out.println("removed from the list  ");
                break;
            } else {
                System.out.println("incorrect seat number or row number  ");
            }
        }
    }


    // display available seat
    public static void show_available() {

        System.out.println(" ");
        System.out.print("Seats available in row 1: ");
        for (int i = 0; i < fRow.length; i++) {
            if (fRow[i] == 0) {
                System.out.print((i + 1) + " ");
            }
        }
        System.out.println(" ");
        System.out.print("Seats available in row 1: ");
        for (int j = 0; j < sRow.length; j++) {
            if (sRow[j] == 0) {
                System.out.print((j + 1) + " ");
            }
        }
        System.out.println(" ");
        System.out.print("Seats available in row 1: ");
        for (int a = 0; a < tRow.length; a++) {
            if (tRow[a] == 0) {
                System.out.print((a + 1) + " ");
            }
        }
        System.out.println("\n");

    }

    // save to a file method
    public static void save() {
        try {
            FileWriter writeFile=new FileWriter("text.txt");
            writeFile.write("\n");
            writeFile.write("Row 1 data:");
            writeFile.write("\n");
            for (int i : fRow) {
                writeFile.write(Integer.toString(i));
                writeFile.write(" ");
            }
            writeFile.write("\n");
            writeFile.write("Row 2 data :");
            writeFile.write("\n");
            for (int i : sRow) {
                writeFile.write(Integer.toString(i));
                writeFile.write(" ");
            }
            writeFile.write("\n");
            writeFile.write("Row 3 data :");
            writeFile.write("\n");
            for (int i : tRow) {
                writeFile.write(Integer.toString(i));
                writeFile.write(" ");
            }
            writeFile.write("\n");
            writeFile.close();
            System.out.println("Data saved to the file");
        } catch (IOException e) {
            System.out.println("An error occurred");
            System.out.println(e);
        }
    }

    // read from the file
    public static void load() {
        try {
            File file=new File("text.txt");
            Scanner readFile = new Scanner(file);
            readFile.nextLine();
            readFile.nextLine();
            String lineNum = readFile.nextLine();
            String[] value = lineNum.split(" ");
            for (int i = 0; i < value.length; i++) {
                fRow[i] = Integer.parseInt(value[i]);
            }
            readFile.nextLine();
            lineNum = readFile.nextLine();
            value = lineNum.split(" ");
            for (int i = 0; i < value.length; i++) {
                sRow[i] = Integer.parseInt(value[i]);
            }
            readFile.nextLine();
            lineNum = readFile.nextLine();
            value = lineNum.split(" ");
            for (int i = 0; i < value.length; i++) {
                tRow[i] = Integer.parseInt(value[i]);
            }
            readFile.close();
            System.out.println("Data from  the file.");
        } catch (IOException e) {
            System.out.println("An error occurred");
            System.out.println(e);
        }
    }
    // show ticket information method
    public static void showTicketsInfo() {
        double priceTotal=0.0;

        System.out.println("Printing ticket information...");
        for (Ticket t : ticket){
            System.out.println("\tName: " + t.getPerson().getName() + " " + t.getPerson().getSurname());
            System.out.println("\tEmail: " + t.getPerson().getEmail());
            System.out.println("\tRow: " + t.getRow());
            System.out.println("\tSeat: " + t.getSeat());
            System.out.println("\tPrice: $" + t.getPrice());
            System.out.println("----------------------------------\n");
            priceTotal += t.getPrice();
        }
        System.out.println("Total Price of all Tickets: " + priceTotal);
    }

    // short by price method
    public static void sortTickets(){
        Ticket[] tickets = ticket.toArray(new Ticket[1]);
        Ticket[] sortedTickets = mergeSort(tickets, 0, tickets.length - 1);
        for (Ticket ticket : sortedTickets) {
            if (ticket != null) {
                ticket.print();
            }
        }

    }
    public static Ticket[] mergeSort(Ticket[] array, int start, int end) {
        Ticket[] sorted;
        if (start < end) {
            int mid = (start + end) / 2;
            Ticket[] array_left = mergeSort(array, start, mid);
            Ticket[] array_right = mergeSort(array, mid + 1, end);
            sorted = merge(array_left, array_right);
        } else {
            sorted = new Ticket[1];
            sorted[0] = array[start];
        }
        return sorted;

    }

    public static Ticket[] merge(Ticket[] array_1, Ticket[] array_2) {
        Ticket[] merged = new Ticket[array_1.length + array_2.length];
        int index1 = 0, index2 = 0, indexMerged = 0;
        while (index1 < array_1.length && index2 < array_2.length) {
            if (array_1[index1].getPrice() <= array_2[index2].getPrice()) {
                merged[indexMerged] = array_1[index1];
                index1++;
            } else {
                merged[indexMerged] = array_2[index2];
                index2++;
            }
            indexMerged++;
        }
        while (index1 < array_1.length) {
            merged[indexMerged] = array_1[index1];
            index1++;
            indexMerged++;
        }
        while (index2 < array_2.length) {
            merged[indexMerged] = array_2[index2];
            index2++;
            indexMerged++;
        }
        return merged;
    }

}








