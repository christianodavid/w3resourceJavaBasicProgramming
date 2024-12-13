import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type the radius: ");
        double radius = scanner.nextDouble();

        double areaResult = area(radius);
        double perimeterResult = perimeter(radius);

        System.out.println("Radius is " + radius);
        System.out.println("Area is " + areaResult);
        System.out.println("Perimeter is " + perimeterResult);

        scanner.close();
    }

    public static double area(double radius) {
        return Math.PI * radius * radius;
    }

    public static double perimeter(double radius) {
        return 2 * Math.PI * radius;
    }
}
