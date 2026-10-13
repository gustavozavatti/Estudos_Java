import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite o numero de peças 1: ");
        int x1 = sc.nextInt();

        System.out.println("Digite o valor: ");
        double p1 = sc.nextDouble();

        System.out.println("Digite o numero de peças 2: ");
        int x2 = sc.nextInt();

        System.out.println("Digite o valor: ");
        double p2 = sc.nextDouble();

        System.out.printf("TOTAL: %.2f%n", (x1 * p1) + (x2 * p2));

        sc.close();
    }
}
