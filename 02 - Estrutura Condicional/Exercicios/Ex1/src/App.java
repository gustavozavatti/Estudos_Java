import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = sc.nextInt();

        if(n >= 0){
            System.out.println("POSITIVO!");
        }
        else{
            System.out.println("NEGATIVO!");
        }

        sc.close();
    }
}
