import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();
        if(year % 4 == 0){
            if((year % 400 == 0) && (year % 100 == 0) ){
                System.out.println("true"); 
            } else if (year % 100 == 0){
                System.out.println("false");
            }else{
                System.out.println("true"); 
            }
        } else if(year % 4 != 0){
                System.out.println("false");
        }
        
    }
}