import java.util.Scanner;

interface Employee {
    double earnings();
    double deductions();
    double bonus();
}

class Manager implements Employee {
    double basic;

    Manager(double basic) {
        this.basic = basic;
    }

    @Override
    public double earnings() {
        return basic + 0.8 * basic + 0.15 * basic;  // basic + DA + HRA
    }

    @Override
    public double deductions() {
        return 0.12 * basic;  // PF deduction
    }

    @Override
    public double bonus() {
        // Not implemented in Manager
        return 0;
    }
}

class Substaff extends Manager {
    Substaff(double basic) {
        super(basic);
    }

    @Override
    public double bonus() {
        return 0.5 * basic;
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        double basic = sc.nextDouble();

        Substaff ss = new Substaff(basic);

        System.out.println("Earnings: " + ss.earnings());
        System.out.println("Deduction: " + ss.deductions());
        System.out.println("Bonus: " + ss.bonus());

        sc.close();
    }
}
