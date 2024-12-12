import java.util.Scanner;

public class BasicArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Second number: ");
        double num2 = scanner.nextDouble();

        double additionResult = sum(num1, num2);
        double subtractionResult = subtract(num1, num2);
        double multiplicationResult = multiply(num1, num2);
        double divisionResult = divide(num1, num2);
        double moduleResult = mod(num1, num2);

        System.out.println(num1 + " + " + num2 + " = " + additionResult);
        System.out.println(num1 + " - " + num2 + " = " + subtractionResult);
        System.out.println(num1 + " * " + num2 + " = " + multiplicationResult);
        System.out.println(num1 + " / " + num2 + " = " + divisionResult);
        System.out.println(num1 + " % " + num2 + " = " + moduleResult);
    }

    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        if(num2 == 0) {
            throw new ArithmeticException("O número não pode ser dividido por 0.");
        }
        return num1 / num2;
    }

    public static double mod(double num1, double num2) {
        if(num2 == 0) {
            throw new ArithmeticException("O número não pode ser dividido por 0.");
        }
        return num1 % num2;
    }
}
