import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite sua renda: ");
        double renda = sc.nextDouble();

        if(renda >= 0.00 && renda <= 2000.00){
            System.out.println("ISENTO!");
        }
        else if(renda >= 2000.01 && renda <= 3000.00){
            System.out.printf("R$: %.2f%n", (renda - 2000.0) * 0.08);
        }
        else if(renda >= 3000.01 && renda <= 4500.00){
            System.out.printf("R$: %.2f%n", (renda - 3000.0) * 0.18 + 1000.0 * 0.08);
        }
        else{
            System.out.printf("R$: %.2f%n", (renda - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08);
        }

        sc.close();
    }
}
