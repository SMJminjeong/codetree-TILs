import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;
        int answer = 0;
        int target = n / 3;
        while(i <= target){
            
            answer = i * 3;
            i++;
            System.out.print(answer + " ");
        }
    }
}