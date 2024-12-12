import java.util.Scanner;

public class DivisionOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Second number: ");
        double num2 = scanner.nextDouble();

        double result = divide(num1, num2);

        System.out.println(num1 + " / " + num2 + " = " + result);
    }

    public static double divide(double num1, double num2) {
        if(num2 == 0) {
            throw new ArithmeticException("O número não pode ser dividido por 0!");
        }
        return num1 / num2;
    }
}
