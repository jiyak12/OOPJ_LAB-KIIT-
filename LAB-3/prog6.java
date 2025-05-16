import java.util.Scanner;

class Rectangle {
    double length, breadth;

    // Default constructor
    Rectangle() {
        length = 0;
        breadth = 0;
    }

    // Parameterized constructor
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double area() {
        return length * breadth;
    }
}

public class RectangleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Using default constructor
        Rectangle rect1 = new Rectangle();
        System.out.println("Area of rectangle with default constructor (0x0): " + rect1.area());

        // Using parameterized constructor
        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();

        Rectangle rect2 = new Rectangle(length, breadth);
        System.out.println("Area of rectangle with parameterized constructor: " + rect2.area());

        sc.close();
    }
}
