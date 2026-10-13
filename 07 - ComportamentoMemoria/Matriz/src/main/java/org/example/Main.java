package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of lines and columns: ");
        int n = sc.nextInt();


        int[][] matriz = new int[n][n];

        System.out.println("Enter the elements of the matriz: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("Main diagonal: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j){
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
        System.out.println();
        System.out.println("Negative numbers: ");
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if(matriz[i][j] < 0){
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }



        sc.close();
    }
}
