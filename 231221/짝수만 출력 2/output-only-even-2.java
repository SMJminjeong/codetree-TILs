import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        a = scanner.nextInt();
        b = scanner.nextInt();

        while (a >= b){
            System.out.print(a + " ");
            a -= 2;
        }
    }
}