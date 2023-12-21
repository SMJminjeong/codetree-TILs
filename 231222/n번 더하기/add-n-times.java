import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,n;
        a = scanner.nextInt();
        n = scanner.nextInt();
        int answer = a;

        for(int i = 0; i < n; i++){
            answer += n;
            System.out.println(answer);
        }
    }
}