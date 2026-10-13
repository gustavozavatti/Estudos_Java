import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System. in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite a quantidade: ");
        int n = sc.nextInt();

        System.out.println("Digite dois números: ");
        for(int i = 0; i < n; i++){
            double n1 = sc.nextInt();
            double n2 = sc.nextInt();

            if(n2 == 0){
                System.out.println("Divisão Impossível!");
            }
            else{
                System.out.printf("%.2f%n", n1 / n2);
            }
        }

        sc.close();
    }
}
