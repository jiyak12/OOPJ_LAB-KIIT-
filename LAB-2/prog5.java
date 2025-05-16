import java.util.HashMap;
import java.util.Scanner;

public class FrequencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Occurrences of elements:");
        for (int key : frequencyMap.keySet()) {
            System.out.println("Occurrence of " + key + " = " + frequencyMap.get(key));
        }

        sc.close();
    }
}
