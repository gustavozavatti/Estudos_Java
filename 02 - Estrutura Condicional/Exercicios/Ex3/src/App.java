import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois números: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if(n2 % n1 == 0){
            System.out.println("Múltiplos!");
        }
        else{
            System.out.println("Não são múltiplos!");
        }

        sc.close();
    }
}
