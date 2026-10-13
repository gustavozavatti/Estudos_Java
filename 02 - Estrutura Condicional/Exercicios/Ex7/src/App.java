import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite X e Y: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if(x > 0 && y > 0){
            System.out.println("QUADRANTE 1!");
        }
        else{
            if(x < 0 && y > 0){
                System.out.println("QUADRANTE 2!");
            }
            else{
                if(x < 0 && y < 0){
                    System.out.println("QUADRANTE 3!");
                }
                else{
                    if(x > 0 && y < 0){
                       System.out.println("QUADRANTE 4!"); 
                    }
                    else{
                        if(x == 0 && y == 0){
                            System.out.println("ORIGEM!");
                        }
                        else{
                            if(x == 0){
                                System.out.println("EIXO Y!");
                            }
                            else{
                                System.out.println("EIXO X!");
                            }
                        }
                    }
                }
            }
        }

        sc.close();
    }
}
