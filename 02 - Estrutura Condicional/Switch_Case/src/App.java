import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o dia da semana: ");
        int x = sc.nextInt();
        String dia;

        switch (x) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
             case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "valor inválido";
                break;
        }

        System.out.printf("Dia: %s%n", dia);

        //CONDIÇÃO TENERÁRIA//
        System.out.println("Digite sua nota: ");
        int n = sc.nextInt();
        System.out.printf("%s", (n >= 6) ? ("Aprovado!") : ("Reprovado"));
        sc.close();
    }
}
