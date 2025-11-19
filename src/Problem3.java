import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        int limit;
        if (a % 2 == 0) {
            limit = a - 1;
        } else {
            limit = a;
        }

        System.out.print("Output: ");

        int currNum = 1;

        for (int i = 0; i < limit; i++) {
            if (i == limit - 1) {
                System.out.print(currNum);
            } else {
                System.out.print(currNum + ", ");
            }
            currNum += 2;
        }
        System.out.println();
    }
}