import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {

        float x = 10.7257f;
        int y = 32;
        System.out.println("Hello, World!");
        System.out.println("Bom dia!");
        System.out.println(y);
        System.out.printf("%.2f%n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", x);
        System.out.printf("Resultado = %.2f metros!%n", x);


        String nome = "Maria";
        int idade = 17;
        float renda = 3589.99f;

        System.out.printf("%s tem %d e ganha RS %.2f reais!%n", nome, idade, renda);


        String msg = String.format("Nome: %s%nIdade: %d%nRenda: %.2f", nome, idade, renda);

        System.out.println(msg);
    }
}
