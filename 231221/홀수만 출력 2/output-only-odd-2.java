import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();

        for(int i = a; i >= b; i--){
            if(i % 2 == 1){
                System.out.print(i + " ");
            }
        }
    }
}