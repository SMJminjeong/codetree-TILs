import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double realNum = scanner.nextDouble();
        if(realNum >= 1.0) System.out.println("High");
        else if(realNum >= 0.5) System.out.println("Middle");
        else System.out.println("Low");
    }
}