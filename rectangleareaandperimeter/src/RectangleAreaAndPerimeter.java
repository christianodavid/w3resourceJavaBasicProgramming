import java.util.Scanner;

public class RectangleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type the width: ");
        double width = scanner.nextDouble();
        System.out.print("Type the height: ");
        double height = scanner.nextDouble();

        double areaResult = area(width, height);
        double perimeterResult = perimeter(width, height);

        System.out.println("Area is " + areaResult);
        System.out.println("Perimeter is " + perimeterResult);

        scanner.close();
    }

    public static double area(double width, double height) {
        return width * height;
    }

    public static double perimeter(double width, double height) {
        return 2 * (width + height);
    }
}
