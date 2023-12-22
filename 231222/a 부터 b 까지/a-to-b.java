import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        a = scanner.nextInt();
        b = scanner.nextInt();

        for(int i = a; i<=b;){
            if(i % 2 == 1){
                System.out.print(i + " ");
                i *= 2;
            }else if (i % 2 == 0){
                System.out.print(i + " ");
                i += 3;
            }
        }
    }
}