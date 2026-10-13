package org.example;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        String[] lines = new String[]{ "Good Morning", "Good Afternoon", "Good Evening" };

        String path = "C:\\Users\\gusta\\OneDrive\\Documentos\\Udemy\\Java\\Arquivos\\Writer\\File1.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
