interface Motor {
    int capacity = 1500;  // in Watts, implicitly public static final

    void run();
    void consume();
}

class WashingMachine implements Motor {
    @Override
    public void run() {
        System.out.println("Washing Machine is running");
    }

    @Override
    public void consume() {
        System.out.println("Washing Machine is consuming power");
    }

    public void displayCapacity() {
        System.out.println("Capacity of the motor is " + capacity + " Watts");
    }
}

public class MotorDemo {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        wm.run();
        wm.consume();
        wm.displayCapacity();
    }
}
