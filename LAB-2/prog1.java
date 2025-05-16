public class LargestNumber {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Please enter 3 numbers as command-line arguments.");
            return;
        }

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);

        int largest = num1;

        if (num2 > largest) largest = num2;
        if (num3 > largest) largest = num3;

        System.out.println("Largest number is: " + largest);
    }
}
