import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a hora inicial: ");
        int hi = sc.nextInt();

        System.out.println("Digite a hora final: ");
        int hf = sc.nextInt();

        if(hf >= 1 && hf <= 24)
        if(hi < hf){
            System.out.printf("Horas jogadas: %d%n", hf - hi);
        }
        else{
            System.out.printf("Horas jogadas: %d%n", (24 - hi) + hf);
        }

        sc.close();
    }
}
