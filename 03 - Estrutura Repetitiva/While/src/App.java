import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número até digitar 0: ");
        int n = sc.nextInt();

        int soma = 0;
        while(n != 0){
            soma += n;
            n = sc.nextInt();
        }

        System.out.printf("Soma total: %d%n", soma);

        sc.close();
    }
}
