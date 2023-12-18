import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String c = scanner.next();
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        System.out.println(c);
        System.out.printf("%.2f%n", a);
        System.out.printf("%.2f",b);
    }
}