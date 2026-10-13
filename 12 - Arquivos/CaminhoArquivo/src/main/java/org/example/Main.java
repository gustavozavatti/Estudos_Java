package org.example;
import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strpath = input.nextLine();

        File path = new File(strpath);

        System.out.println("Name: " + path.getName());
        System.out.println("Parent: " + path.getParent());
        System.out.println("Path: " + path.getPath());

        input.close();
    }
}
