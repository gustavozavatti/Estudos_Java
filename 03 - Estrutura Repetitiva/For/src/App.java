import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade: ");
        int n = sc.nextInt();
        int v, s = 0;

        System.out.println("Digite os números: ");
        for(int i = 0; i < n; i++){
            v = sc.nextInt();
            s += v;
        }

        System.out.printf("Soma total: %d%n", s);

        sc.close();
    }
}
