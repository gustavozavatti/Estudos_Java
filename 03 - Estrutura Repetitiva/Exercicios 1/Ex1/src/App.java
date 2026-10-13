import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);

       System.out.println("Digite a senha: ");
        int n = sc.nextInt();

        while(n != 2002){
            System.out.println("Senha Inválida!");
            n = sc.nextInt();
        }

        System.out.println("Acesso Permitido!");

       sc.close();
    }
}
