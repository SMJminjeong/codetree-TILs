import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(a % 2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
        if(b % 2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}