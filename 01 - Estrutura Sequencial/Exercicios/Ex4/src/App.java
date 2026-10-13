import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite o numero: ");
        int n = sc.nextInt();

        System.out.println("Horas trabalhadas: ");
        int h = sc.nextInt();

        System.out.println("Valor por hora: ");
        double tt = sc.nextDouble();

        System.out.println();
        System.out.printf("NUMBER: %d%n", n);
        System.out.printf("SALARY: %.2f%n", tt * h);
        sc.close();
    }
}
