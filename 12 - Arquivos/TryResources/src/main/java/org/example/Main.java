package org.example;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String path = "C:\\Users\\gusta\\OneDrive\\Documentos\\Udemy\\Java\\Arquivos\\TryResources\\File.txt";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = bufferedReader.readLine();

            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
