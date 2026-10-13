package org.example;
import org.example.entities.Circle;
import org.example.entities.Color;
import org.example.entities.Rectangle;
import org.example.entities.Shape;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Shape> listShapes = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int numberShapes = sc.nextInt();

        for(int i = 0; i < numberShapes; i++){
            sc.nextLine();
            System.out.println("Shape #" + (i + 1) + " data: ");

            System.out.print("Rectangle or Circle (r/c): ");
            String typeShape = sc.nextLine().toLowerCase();

            System.out.print("Color (BLACK/BLUE/RED): ");
            Color colorShape = Color.valueOf(sc.nextLine().toUpperCase());

            switch (typeShape){
                case "r":
                    System.out.print("Width: ");
                    double widthShape = sc.nextDouble();
                    System.out.print("Height: ");
                    double heightShape = sc.nextDouble();

                    listShapes.add(new Rectangle(colorShape, widthShape, heightShape));
                    break;
                case "c":
                    System.out.print("Radius: ");
                    double radiusShape = sc.nextDouble();

                    listShapes.add(new Circle(colorShape, radiusShape));
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }

        System.out.println("SHAPE AREAS: ");
        for(Shape shapes : listShapes){
            System.out.println(shapes.area());
        }


        sc.close();
    }
}