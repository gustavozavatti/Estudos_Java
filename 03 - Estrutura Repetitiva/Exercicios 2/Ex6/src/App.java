import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = sc.nextInt();

        System.out.println("Divisores: ");
        for(int i = n; i > 0; i--){
            if(n % i == 0){
                System.out.printf("%d%n", i);
            }
        }

        sc.close();
    }
}
