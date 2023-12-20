import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tempA, tempB, tempC;
        String coldFlagA, coldFlagB, coldFlagC;

        coldFlagA = scanner.next();
        tempA = scanner.nextInt();
        coldFlagB = scanner.next();
        tempB = scanner.nextInt();
        coldFlagC = scanner.next();
        tempC = scanner.nextInt();

        String statA, statB, statC;
        if(coldFlagA.equals("Y")){
            if(tempA >= 37){
                statA = "A";
            }else{
                statA = "C";
            }
        }else{
            if(tempA >= 37){
                statA = "B";
            }else{
                statA = "D";
            }
        }
        if(coldFlagB.equals("Y")){
            if(tempB >= 37){
                statB = "A";
            }else{
                statB = "C";
            }
        }else{
            if(tempB >= 37){
                statB = "B";
            }else{
                statB = "D";
            }
        }
        if(coldFlagC.equals("Y")){
            if(tempC >= 37){
                statC = "A";
            }else{
                statC = "C";
            }
        }else{
            if(tempC >= 37){
                statC = "B";
            }else{
                statC = "D";
            }
        }

        int count = 0;

        if(statA.equals("A")) {count++;}
        if(statB.equals("A")) {count++;}
        if(statC.equals("A")) {count++;}

        if(count >= 2) System.out.println("E");
        else System.out.println("N");
    }
}