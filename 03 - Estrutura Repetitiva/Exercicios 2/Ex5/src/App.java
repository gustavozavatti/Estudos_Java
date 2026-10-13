import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número: ");
        int n = sc.nextInt();
        int fat = 1;

        for(int i = n; i > 0; i--){
            fat *= i;
        }

        System.out.printf("Fatorial: %d%n", fat);
        sc.close();
    }
}
