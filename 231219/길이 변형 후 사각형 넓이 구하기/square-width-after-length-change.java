import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        x += 8;
        y *= 3;
        System.out.println(x);
        System.out.println(y);
        System.out.println(x*y);
    }
}