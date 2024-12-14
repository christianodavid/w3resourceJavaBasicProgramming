public class SwapVariables {
    public static void main(String[] args) {
        double a, b, temp;

        a = 25;
        b = 10.5;

        System.out.println("'a' and 'b' before swapping: " + a + ", " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("'a' and 'b' after swapping: " + a + ", " + b);
    }
}
