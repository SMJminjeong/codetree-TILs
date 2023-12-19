import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int midTerm, finalTerm;
        midTerm = scanner.nextInt();
        finalTerm = scanner.nextInt();

        if(midTerm >= 90 && finalTerm >= 95){
            System.out.println("100000");
        }else if (midTerm >= 90 && finalTerm >= 90){
            System.out.println("50000");
        }else{
            System.out.println("0");
        }
    }
}