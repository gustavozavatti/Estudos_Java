public class App {
    public static void main(String[] args) throws Exception {
        String original = "abcde FHIJ ABC abc DEFG      ";

        System.out.printf("-%s-%n", original); //Original
        String s01 = original.toLowerCase(); //Minúsculas
        System.out.printf("-%s-%n", s01);
        s01 = original.toUpperCase(); //Maiúsculas
        System.out.printf("-%s-%n", s01);

        s01 = original.trim(); //Corta o espaço em branco
        System.out.printf("-%s-%n", s01);

        s01 = original.substring(2); //Pega apartir da posicao
        System.out.printf("-%s-%n", s01);
        s01 = original.substring(2, 9); //Pega apartir da posicao, com limite
        System.out.printf("-%s-%n", s01);

        s01 = original.replace('a', 'x'); //Troca letra
        System.out.printf("-%s-%n", s01);

        s01 = original.replace("abc", "xy"); //Troca letra mais posições
        System.out.printf("-%s-%n", s01);

        int i = original.indexOf("bc"); // Primeira Ocorrência
        System.out.println(i); 

        i = original.lastIndexOf("bc"); // Primeira de traz pra frente
        System.out.println(i);

        String s = "potato apple lemon";

        String[] vet = s.split(" "); //Divide a string em menores strings
        System.out.println(vet[0]);
        System.out.println(vet[1]);
        System.out.println(vet[2]);

    }
}
