package lesson3;

public class TestMethod {
    public static void main(String[] args) {
        multiply(3.3, 4);
    }

    private static void multiply(int a, int b) {
        int multiply = a * b;
        System.out.printf("Произведение %d и %d равно %d%n", a, b, multiply);
    }

    private static void multiply(double a, double b) {
        double multiply = a * b;
        System.out.printf("Произведение %g и %f равно %f(дробные)%n", a, b, multiply);
    }
}
