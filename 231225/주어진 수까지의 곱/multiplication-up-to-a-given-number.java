import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        int max = Math.max(a, b);
        int min = Math.min(a, b);

        int answer = 1;
        for(int i = min; i<=max; i++){
            answer *= i;
        }

        System.out.print(answer);
    }
}