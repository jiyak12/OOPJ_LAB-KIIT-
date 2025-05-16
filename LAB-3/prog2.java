import java.util.Scanner;

class Rectangle {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double area() {
        return length * breadth;
    }

    double perimeter() {
        return 2 * (length + breadth);
    }

    void display() {
        System.out.println("Area of Rectangle: " + area());
        System.out.println("Perimeter of Rectangle: " + perimeter());
    }
}

public class DemoRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();

        Rectangle rect = new Rectangle(length, breadth);
        rect.display();

        sc.close();
    }
}
