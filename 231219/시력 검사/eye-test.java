import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double right, left;
        right = scanner.nextDouble();
        left = scanner.nextDouble();

        System.out.println(((right >= 1.0) && (left >= 1.0)) ? "High" : ((right >= 0.5) && (left >= 0.5)) ? "Middle" : "Low");
    }
}