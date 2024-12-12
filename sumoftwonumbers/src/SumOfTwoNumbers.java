import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Second number: ");
        double num2 = scanner.nextDouble();

        double result = sum(num1, num2);

        System.out.println(num1 + " + " + num2 + " = " + result);
    }

    public static double sum(double num1, double num2) {
        return num1 + num2;
    }
}
