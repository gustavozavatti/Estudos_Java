package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        metod1();
        System.out.println("End of program!");
    }

    public static void metod1() {
        System.out.println("***METHOD1 START***");
        metod2();
        System.out.println("***METHOD1 END***");
    }

    public static void metod2(){
        System.out.println("***METHOD2 START***");
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int postion = sc.nextInt();
            System.out.println(vect[postion]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
        }catch (InputMismatchException e){
            System.out.println("Input error!");
        }
        sc.close();
        System.out.println("***METHOD2 END***");
    }
}
