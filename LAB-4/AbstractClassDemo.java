import java.util.Scanner;

abstract class Student {
    int rollNo;
    long regNo;

    void getInput(Scanner sc) {
        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();
        System.out.print("Enter Registration No: ");
        regNo = sc.nextLong();
    }

    abstract void course();
}

class Kiitian extends Student {
    @Override
    void course() {
        System.out.println("Course: B.Tech. (Computer Science & Engg)");
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Registration No: " + regNo);
        course();
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kiitian k = new Kiitian();

        k.getInput(sc);
        k.display();

        sc.close();
    }
}
