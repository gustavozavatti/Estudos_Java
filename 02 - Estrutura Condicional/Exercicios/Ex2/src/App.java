import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = sc.nextInt();

        if(n % 2 == 0){
            System.out.println("PAR!");
        }
        else{
            System.out.println("ÍMPAR!");
        }

        sc.close();
    }
}
