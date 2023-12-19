import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        int min = Math.min(a,b);
        min = Math.min(min,c);

        if(a == min) System.out.print("1");
        else System.out.print("0");

        if(a == b && b == c) System.out.print(" 1");
        else System.out.print(" 0");
    }
}