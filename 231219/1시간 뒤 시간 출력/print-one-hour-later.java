import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(":");
        int h = scanner.nextInt();
        int m = scanner.nextInt();

        System.out.println(h+1+":"+m);
    }
}