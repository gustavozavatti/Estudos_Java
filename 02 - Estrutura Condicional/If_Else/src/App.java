import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a hora do dia: ");
        int h = sc.nextInt();

        if(h >= 6 && h <= 11){
            System.out.println("BOM DIA!");
        }
        else{
            if(h > 11 && h <=  18){
                System.out.println("BOA TARDE!");
            }
            else{
                System.out.println("BOA NOITE!");
            }
        }

        sc.close();
    }
}
