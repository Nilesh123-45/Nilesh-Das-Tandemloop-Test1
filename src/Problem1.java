import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Give the input
        System.out.print("Enter first number for a: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number for b: ");
        double b = sc.nextDouble();

        //Enter the valid options that is coming under the operations
        System.out.print("Enter type of operation (+, -, *, /): ");
        String operation = sc.next();

        double result = 0;
        switch (operation) {
            case "+":
            case "add":
                result = a + b;
                break;
            case "-":
            case "subtract":
                result = a - b;
                break;
            case "*":
            case "multiply":
                result = a * b;
                break;
            case "/":
            case "divide":
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Cannot divide by zero");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation");
                return;
        }

        System.out.println("Result for the operation is: " + result);
    }
}