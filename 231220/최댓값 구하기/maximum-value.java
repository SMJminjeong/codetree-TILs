import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a,b,c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        int max = Math.max(a,b);
        max = Math.max(max,c);

        System.out.println(max);
    }
}