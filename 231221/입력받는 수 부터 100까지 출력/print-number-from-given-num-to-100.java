import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();

        for(int i = n; i<101; i++){
            System.out.print(i + " ");
        }
    }
}