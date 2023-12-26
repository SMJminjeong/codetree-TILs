import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        int max = Math.max(a, b);
        int min = Math.min(a, b);

        int gcd = findGCD(1920, 2880);
        boolean isExist = false;

        for(int i = min; i<=max; i++){
            if(gcd % i == 0){
                isExist = true;
            }
        }
        if(isExist){
            System.out.print("1");
        }else{
            System.out.print("0");
        }

    }

    public static int findGCD(int a, int b){
        while(true){
            int temp = b;
            b = a % b;
            a = temp;

            if(b == 0) break;
        }
        return a;
    }
}