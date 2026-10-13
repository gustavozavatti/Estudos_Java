import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade: ");
        int n = sc.nextInt();
        int x1, x2, x3;

        System.out.println("Digite três números: ");
        for(int i = 0; i < n; i++){
            x1 = sc.nextInt();
            x2 = sc.nextInt();
            x3 = sc.nextInt();
            int s = x1 + x2 + x3;   
            System.out.printf("Média: %d%n", s / 3);
        }

        sc.close();
    }
}
