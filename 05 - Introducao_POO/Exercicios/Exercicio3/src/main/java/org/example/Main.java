package org.example;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Student student = new Student();

        System.out.print("Enter your name: ");
        student.name = sc.nextLine();
        System.out.print("Enter your grade 1: ");
        student.grade1 = sc.nextDouble();
        System.out.print("Enter your grade 2: ");
        student.grade2 = sc.nextDouble();
        System.out.print("Enter your grade 3: ");
        student.grade3 = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());

        if (student.finalGrade() < 60.0){
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
        }
        else {
            System.out.println("PASS");
        }

        sc.close();
    }
}
