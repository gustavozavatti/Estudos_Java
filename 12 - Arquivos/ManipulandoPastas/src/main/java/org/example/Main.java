package org.example;
import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strpath = sc.nextLine();

        File path = new File(strpath);

        File[] folders = path.listFiles(File::isDirectory);

        System.out.println("Folders: ");
        for (File file : folders) {
            System.out.println(file.getAbsolutePath());
        }

        System.out.println("Files:  ");
        File[] files = path.listFiles(File::isFile);
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }

        boolean success = new File(strpath + "\\subdir").mkdir();
        System.out.println("Folder created: " + success);

        sc.close();
    }
}
