import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        System.out.println("Digite o raio: ");
        double r = sc.nextDouble();

        double a = pi * Math.pow(r, 2);

        System.out.printf("A = %.2f%n", a);

        sc.close();
    }
}
