import java.util.Scanner;

interface Employee {
    void getDetails();
}

interface Manager extends Employee {
    void getDeptDetails();
}

class Head implements Manager {
    int empId, deptId;
    String empName, deptName;
    Scanner sc = new Scanner(System.in);

    @Override
    public void getDetails() {
        System.out.print("Enter employee id: ");
        empId = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter employee name: ");
        empName = sc.nextLine();
    }

    @Override
    public void getDeptDetails() {
        System.out.print("Enter department id: ");
        deptId = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter department name: ");
        deptName = sc.nextLine();
    }

    public void display() {
        System.out.println("Employee id: " + empId);
        System.out.println("Employee name: " + empName);
        System.out.println("Department id: " + deptId);
        System.out.println("Department name: " + deptName);
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Head head = new Head();
        head.getDetails();
        head.getDeptDetails();
        System.out.println();
        head.display();
    }
}
