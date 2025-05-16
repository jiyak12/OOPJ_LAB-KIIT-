class Apple {
    void show() {
        System.out.println("Apple class show method");
    }
}

class Banana extends Apple {
    @Override
    void show() {
        System.out.println("Banana class show method");
    }
}

class Cherry extends Apple {
    @Override
    void show() {
        System.out.println("Cherry class show method");
    }
}

public class FruitDemo {
    public static void main(String[] args) {
        Apple a;

        a = new Apple();
        a.show();

        a = new Banana();
        a.show();

        a = new Cherry();
        a.show();
    }
}
