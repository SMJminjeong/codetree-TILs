import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a; 
        a = scanner.nextInt();

        System.out.println((a >= 10) && (a <= 20) ? "yes" : "no");
    }
}