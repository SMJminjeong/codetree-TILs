import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month; 
        month = scanner.nextInt();

        if(month >= 3 && month <= 5){
            System.out.println("Spring");
        }else if (month >= 6 && month <= 8){
            System.out.println("Summner");
        }else if (month >= 9 && month <= 11){
            System.out.println("Fall");
        }else if (month == 12 || month <= 2){
            System.out.println("Winter");
        }
        
    }
}