import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //체질량지수 : 몸무게 / 키*키
        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();
        int weight = scanner.nextInt();

        int bmi = (weight*10000) / (height*height);

        System.out.println(bmi);
        if(bmi > 25) System.out.println("Obesity");
    }
}