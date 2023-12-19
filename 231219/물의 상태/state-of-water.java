import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int temp = scanner.nextInt();
        if(temp < 0) System.out.println("ice");
        if(0 < temp && temp <= 100) System.out.println("water");
        else if(temp >= 100) System.out.println("vapor");
        
    }
}