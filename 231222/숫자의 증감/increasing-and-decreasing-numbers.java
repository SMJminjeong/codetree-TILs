import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String c = scanner.next();
        int n = scanner.nextInt();

        if(c.equals("A")){
            for(int i = 1; i<= n; i++){
                System.out.print(i + " ");
            }
        }else if(c.equals("D")){
            for(int i = n; i >= 1; i--){
                System.out.print(i + " ");
            }    
        }
    }
}