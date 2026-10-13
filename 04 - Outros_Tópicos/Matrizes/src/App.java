import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de linhas: ");
        int l = sc.nextInt();

        System.out.println("Digite o número de colunas: ");
        int c = sc.nextInt();

        int[][] mat = new int[l][c];

        System.out.println("Digite os valores: ");
        for(int i = 0; i < l; i++){
            for(int j = 0; j < c; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Números digitados: ");
        for(int i = 0; i < l; i++){
            for(int j = 0; j < c; j++){
                System.out.printf("%d ", mat[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
