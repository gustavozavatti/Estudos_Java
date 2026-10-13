public class App {
    public static void main(String[] args) throws Exception {
        double x = 5, y = 2, c = -3;
        
        double a = Math.sqrt(x);
        System.out.printf("%.2f%n", a);

        a = Math.pow(x, y);
        System.out.println(a);

        a = Math.abs(c);
        System.out.println(a);
    }
}
