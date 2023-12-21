import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;
        int answer = 0;
        while(answer < n){
            answer = i * 3;
            System.out.print(answer + " ");
            i++;
        }
    }
}