import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Third number: ");
        double num3 = scanner.nextDouble();

        double averageResult = average(num1, num2, num3);

        System.out.println("The average is " + averageResult);
    }

    public static double average(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }
}
