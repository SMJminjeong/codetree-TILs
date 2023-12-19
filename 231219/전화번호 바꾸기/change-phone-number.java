import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("-");
        String front = scanner.next();
        int xxxx = scanner.nextInt();
        int yyyy = scanner.nextInt();
        
        System.out.println(front+"-"+yyyy+"-"+xxxx);
    }
}