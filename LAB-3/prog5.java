import java.util.Scanner;

class AreaCalculator {
    // Area of circle
    double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Area of triangle
    double area(double base, double height) {
        return 0.5 * base * height;
    }

    // Area of square
    double area(int side) {
        return side * side;
    }
}

public class AreaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AreaCalculator calc = new AreaCalculator();

        System.out.println("Choose shape to calculate area:");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Square");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter radius of circle: ");
                double radius = sc.nextDouble();
                System.out.println("Area of Circle: " + calc.area(radius));
                break;

            case 2:
                System.out.print("Enter base of triangle: ");
                double base = sc.nextDouble();
                System.out.print("Enter height of triangle: ");
                double height = sc.nextDouble();
                System.out.println("Area of Triangle: " + calc.area(base, height));
                break;

            case 3:
                System.out.print("Enter side of square: ");
                int side = sc.nextInt();
                System.out.println("Area of Square: " + calc.area(side));
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
