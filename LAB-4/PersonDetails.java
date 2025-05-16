import java.util.Scanner;

class Account {
    int acc_no;
    double balance;

    void input(Scanner sc) {
        System.out.print("Enter Account Number: ");
        acc_no = sc.nextInt();
        System.out.print("Enter Balance: ");
        balance = sc.nextDouble();
    }

    void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    String name;
    String aadhar_no;

    void inputDetails(Scanner sc) {
        sc.nextLine(); // consume leftover newline
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Aadhar Number: ");
        aadhar_no = sc.nextLine();
        super.input(sc);
    }

    @Override
    void disp() {
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
        super.disp();
        System.out.println("-------------------------");
    }
}

public class PersonDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] persons = new Person[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details of person " + (i + 1));
            persons[i] = new Person();
            persons[i].inputDetails(sc);
        }

        System.out.println("\nDetails of all persons:");
        for (Person p : persons) {
            p.disp();
        }

        sc.close();
    }
}
