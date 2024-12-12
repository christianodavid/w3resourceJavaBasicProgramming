import java.util.Scanner;

public class HelloAndNamePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tell me your name: ");
        String name = scanner.nextLine();

        System.out.println();
        System.out.println("Hello, " + name + "!");
    }
}
