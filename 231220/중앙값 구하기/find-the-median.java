import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if((a>b) && (a<c)){
            System.out.println(a);
        }else if ((b>a) && (b<c)){
            System.out.println(b);
        }else if ((c>a) && (c<a)){
            System.out.println(c);
        }
    }
}