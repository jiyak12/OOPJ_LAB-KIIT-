class Calculator {
    // Subtract two integers
    int subtract(int a, int b) {
        return a - b;
    }

    // Subtract three integers
    int subtract(int a, int b, int c) {
        return a - b - c;
    }

    // Subtract two doubles
    double subtract(double a, double b) {
        return a - b;
    }

    // Subtract one integer from double
    double subtract(double a, int b) {
        return a - b;
    }
}

public class SubtractDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Subtract 2 integers (10 - 5): " + calc.subtract(10, 5));
        System.out.println("Subtract 3 integers (20 - 5 - 3): " + calc.subtract(20, 5, 3));
        System.out.println("Subtract 2 doubles (10.5 - 3.2): " + calc.subtract(10.5, 3.2));
        System.out.println("Subtract int from double (10.5 - 2): " + calc.subtract(10.5, 2));
    }
}
