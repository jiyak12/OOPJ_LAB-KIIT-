
import java.util.Scanner;

class Box {
    double length, width, height;

    void setDimensions(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    double volume() {
        return length * width * height;
    }
}

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Box box = new Box();

        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Enter width: ");
        double width = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        box.setDimensions(length, width, height);
        System.out.println("Volume of the box is: " + box.volume());

        sc.close();
    }
}
