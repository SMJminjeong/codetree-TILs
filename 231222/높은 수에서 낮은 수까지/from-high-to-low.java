import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a,b;
        a = scanner.nextInt();
        b = scanner.nextInt();

        int max = Math.max(a,b);
        int min = Math.min(a,b);

        for(int i = max; i>=min; i--){
            System.out.print(i + " ");
        }
    }
}