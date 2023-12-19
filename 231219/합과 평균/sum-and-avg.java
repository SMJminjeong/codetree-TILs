import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        //합과 평균
        System.out.printf("%d %.1f", a+b, (double)(a+b)/2);
    }
}