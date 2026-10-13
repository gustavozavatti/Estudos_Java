import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade: ");
        int n = sc.nextInt();
        int in = 0, out = 0;

        System.out.println("Digite os números: ");
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            if(x >= 10 && x <= 20){
                in++;
            }
            else{
                out++;
            }
        }

        System.out.printf("Dentro: %d%n", in);
        System.out.printf("Fora: %d%n", out);
        sc.close();
    }
}
