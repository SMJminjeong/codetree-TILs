import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(a % 2 == 0){
            a /= 2;
        }
        if(a % 2 != 0){
            a = (a+1) / 2;
        }
        System.out.println(a);
    }
}