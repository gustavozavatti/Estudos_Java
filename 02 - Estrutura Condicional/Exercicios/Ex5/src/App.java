import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite o código do produto: ");
        int c = sc.nextInt();

        System.out.println("Digite a quantidade: ");
        int q = sc.nextInt();

        if(c == 1){
            System.out.printf("Valor: %.2f%n", 4.00 * q);
        }
        else{
            if(c == 2){
                 System.out.printf("Valor: %.2f%n", 4.50 * q);
            }
            else{
                if(c == 3){
                     System.out.printf("Valor: %.2f%n", 5.00 * q);
                }
                else{
                    if(c == 4){
                         System.out.printf("Valor: %.2f%n", 2.00 * q);
                    }
                        else{
                             System.out.printf("Valor: %.2f%n", 1.50 * q);
                        }
                }
            }
        }

        sc.close();
    }
}
