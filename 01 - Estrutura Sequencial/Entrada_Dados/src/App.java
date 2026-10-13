import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite seu nome: ");
        String x = sc.next();

        System.out.println("Digite sua idade: ");
        int i = sc.nextInt();

        System.out.println("Digite seu salário: ");
        double s = sc.nextDouble();

        System.out.println("Digite seu setor: ");
        char l = sc.next().charAt(0);

        System.out.println();

        System.out.printf("Nome: %s%n", x);
        System.out.printf("Idade: %d%n", i);
        System.out.printf("Salário: %.2f%n", s);
        System.out.printf("Setor: %c%n", l);

        //Até a quebra de linha//

        sc.nextLine();

        System.out.println("Nome: ");
        String s1 = sc.nextLine();

        System.out.println("Presidente: ");
        String s2 = sc.nextLine();

        System.out.println("Setor: ");
        String s3 = sc.nextLine();

        System.out.println("Dados digitados: ");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}
