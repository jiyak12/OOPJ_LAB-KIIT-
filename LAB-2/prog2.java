public class EvenOddCounter {
    public static void main(String[] args) {
        if (args.length != 10) {
            System.out.println("Please enter exactly 10 numbers as command-line arguments.");
            return;
        }

        int evenCount = 0, oddCount = 0;

        for (String arg : args) {
            int num = Integer.parseInt(arg);
            if (num % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }

        System.out.println("Number of Even Numbers: " + evenCount);
        System.out.println("Number of Odd Numbers: " + oddCount);
    }
}
