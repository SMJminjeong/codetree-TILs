import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\.");
        int yyyy = scanner.nextInt();
        int mm = scanner.nextInt();
        int dd = scanner.nextInt();

        System.out.println(mm+"-"+dd+"-"+yyyy);
    }
}