import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor 1: ");
        int n1 = sc.nextInt(); 
        System.out.println("Digite o valor 2: ");
        int n2 = sc.nextInt(); 
        System.out.println("Digite o valor 3: ");
        int n3 = sc.nextInt(); 
        System.out.println("Digite o valor 4: ");
        int n4 = sc.nextInt(); 

        System.out.printf("Diferença: %d", (n1 * n2) - (n3 * n4));

        sc.close();
    }
}
