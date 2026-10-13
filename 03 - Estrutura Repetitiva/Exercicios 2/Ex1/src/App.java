import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System. in);

        System.out.println("Digite o valor: ");
        int n = sc.nextInt();

        System.out.println("Números ímpares: ");
        for(int i = n; i > 0; i--){
            if(i % 2 == 1){
                System.out.printf("%d%n", i);
            }
        }

        sc.close();
    }
}
