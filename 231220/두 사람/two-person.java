import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstPerson, secondPerson;
        String firstGender, secondGender;

        firstPerson = scanner.nextInt();
        firstGender = scanner.next();
        secondPerson = scanner.nextInt();
        secondGender = scanner.next();

        if((firstPerson >= 19 && firstGender.equals("M")) || (secondPerson >= 19 && secondGender.equals("M"))){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}