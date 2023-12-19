import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("-");

        int mm = scanner.nextInt();
        int dd = scanner.nextInt();
        int yyyy = scanner.nextInt();

        System.out.println(yyyy+"."+mm+"."+dd);
    }
}