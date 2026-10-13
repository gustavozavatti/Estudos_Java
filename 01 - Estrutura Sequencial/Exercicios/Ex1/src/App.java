import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int x = sc.nextInt();

        System.out.println("Digite o segundo valor: ");
        int y = sc.nextInt();

        System.out.printf("SOMA: %d", x + y);

        sc.close();
    }
}
