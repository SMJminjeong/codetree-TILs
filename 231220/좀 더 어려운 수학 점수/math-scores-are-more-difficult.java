import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aMath, aEng;
        int bMath, bEng;

        aMath = scanner.nextInt();
        aEng = scanner.nextInt();
        bMath = scanner.nextInt();
        bEng = scanner.nextInt();

        if(aMath > bMath){
            System.out.println("A");
        }else if(aMath == bMath && aEng > bEng){
            System.out.println("A");
        }else{
            System.out.println("B");
        }

    }
}