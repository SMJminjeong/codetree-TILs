import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mathA, engA, mathB, engB;
        mathA = scanner.nextInt();
        engA = scanner.nextInt();
        mathB = scanner.nextInt();
        engB = scanner.nextInt();

        System.out.println((mathA > mathB) && (engA > engB) ? 1 : 0);
    }
}