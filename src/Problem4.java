import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //enter the length of the array
        System.out.print("How many numbers do you want to enter? ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        //enter the input by
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= 9; i++) {
            int c = 0;

            for (int p : numbers) {
                if (p % i == 0) {
                    c++;
                }
            }

            map.put(i, c);
        }

        // Print in required format
        System.out.println("{");
        for (int i = 1; i <= 9; i++) {
            System.out.println("Multiples of "+i + ": " + map.get(i));
            if (i < 9) System.out.print(", ");
        }
        System.out.println("}");
        sc.close();//close the scanner so that i can preserve the m/r
    }
}
