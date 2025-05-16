import java.util.Scanner;

class PlasticSheet {
    double length, width;
    static final double COST_PER_SQFT = 40;

    PlasticSheet(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }

    double cost() {
        return area() * COST_PER_SQFT;
    }
}

class PlasticBox extends PlasticSheet {
    double height;
    static final double COST_PER_CUBICFT = 60;

    PlasticBox(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    double volume() {
        return length * width * height;
    }

    @Override
    double cost() {
        return volume() * COST_PER_CUBICFT;
    }
}

public class PlasticCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter dimensions for 2D sheet:");
        System.out.print("Length (ft): ");
        double length = sc.nextDouble();
        System.out.print("Width (ft): ");
        double width = sc.nextDouble();

        PlasticSheet sheet = new PlasticSheet(length, width);
        System.out.println("Cost of 2D sheet: Rs " + sheet.cost());

        System.out.println("\nEnter dimensions for 3D box:");
        System.out.print("Length (ft): ");
        length = sc.nextDouble();
        System.out.print("Width (ft): ");
        width = sc.nextDouble();
        System.out.print("Height (ft): ");
        double height = sc.nextDouble();

        PlasticBox box = new PlasticBox(length, width, height);
        System.out.println("Cost of 3D box: Rs " + box.cost());

        sc.close();
    }
}
