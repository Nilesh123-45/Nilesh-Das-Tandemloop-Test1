import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.print("Output: ");

        int currentNumber = 1;
        for (int i = 0; i < a; i++) {
            if (i == a - 1) {
                System.out.print(currentNumber);
            } else {
                System.out.print(currentNumber + ", ");
            }
            currentNumber =currentNumber+ 2;
        }
        System.out.println();
    }
}