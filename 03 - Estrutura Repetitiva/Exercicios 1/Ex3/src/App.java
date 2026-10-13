import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = 0, g = 0, d = 0;

        System.out.println("Digite seu combúsitvel: ");
        int e = sc.nextInt();
         while (e != 4) {
            switch (e) {
                case 1:
                    a++;
                    break;
                case 2:
                    g++;
                    break;
                case 3:
                    d++;
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
            e = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO!");
        System.out.printf("ÁLCOOL: %d%n", a);
        System.out.printf("Gasolina: %d%n", g);
        System.out.printf("DIESEL: %d%n", d);

        sc.close();
    }
}
