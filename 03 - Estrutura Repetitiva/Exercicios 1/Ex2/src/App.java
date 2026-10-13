import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System. in);

        System.out.println("Digite X e Y: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        while(x != 0 && y != 0){
            if(x > 0 && y > 0){
                System.out.println("Q1");
            }
            else if(x < 0 && y > 0){
                System.out.println("Q2");
            }
            else if(x < 0 && y < 0){
                System.out.println("Q3");
            }
            else if(x > 0 && y < 0){
                System.out.println("Q4");
            }

            x = sc.nextInt();
            y = sc.nextInt();
        }
        sc.close();
    }
}
