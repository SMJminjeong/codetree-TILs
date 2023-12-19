import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age, gender;
        gender = scanner.nextInt();
        age = scanner.nextInt();

        if(age > 19 && gender == 0){
            System.out.println("MAN");
        }else if (age <= 19 && gender == 0){
            System.out.println("BOY");
        }else if (age > 19 && gender == 1){
            System.out.println("WOMAN");
        }else if (age <= 19 && gender == 1){
            System.out.println("GIRL");
        }
    }
}