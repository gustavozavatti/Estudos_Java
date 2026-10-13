import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.printf("%d %d %d%n", i, i * i, i * i * i);
        }
        sc.close();
    }
}
