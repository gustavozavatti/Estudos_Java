import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double pi = 3.14159;

        System.out.println("Digite valor A: ");
        double a = sc.nextDouble();
        System.out.println("Digite valor B: ");
        double b = sc.nextDouble();
        System.out.println("Digite valor C: ");
        double c = sc.nextDouble();

        System.out.printf("Triângulo: %.2f%n", (a * c) / 2);
        System.out.printf("Circulo: %.2f%n", pi * Math.pow(c, 2));
        System.out.printf("Trapezio: %.2f%n", (((a + b) * c) / 2));
        System.out.printf("Quadrado: %.2f%n", Math.pow(b, 2));
        System.out.printf("Retângulo: %.2f%n", a * b);

        sc.close();
    }
}
