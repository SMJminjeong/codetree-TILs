import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a,b;
        a = scanner.nextInt();
        b = scanner.nextInt();

        int temp = 0;

        for(int i = 0; i<21; i++){
            if(i == 0){
                if(a/b == 0){
                    System.out.print(0+".");
                    a = (a%b) * 10;
                }else if(a/b != 0 && a%b ==0){
                    System.out.print(a/b + ".");
                    a = (a%b) * 10;
                }else if(a/b != 0 && a%b != 0 ){
                    System.out.print(a/b + ".");
                    a = (a%b) * 10;
                }
            } else if (i != 0){
                System.out.print(a/b);
                a = (a%b) * 10;
            }
        }
    }
    
}