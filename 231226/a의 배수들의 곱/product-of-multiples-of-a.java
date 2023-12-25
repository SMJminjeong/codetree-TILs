import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        int answer = 1;
        for(int i = 1; i<=b; i++){
            if(i % a == 0){
                answer *= i;
            }
        }
        System.out.print(answer);
    }
}