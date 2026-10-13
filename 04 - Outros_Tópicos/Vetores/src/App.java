import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidade de números: ");
        int n = sc.nextInt();

        double[] vet = new double[n];

        System.out.println("Digite os numeros: ");
        for(int i = 0; i < n; i++){
            vet[i] = sc.nextDouble();
        }

        System.out.println("Números digitados: ");
        for(int i = 0; i < n; i++){
            System.out.println(vet[i]);
        }

        sc.close();
    }
}
