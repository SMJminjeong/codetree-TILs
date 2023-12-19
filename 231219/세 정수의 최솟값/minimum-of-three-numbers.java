import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a,b,c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        int min = Math.min(a,b);
        min = Math.min(min,c);

        System.out.println(min);
    }
}