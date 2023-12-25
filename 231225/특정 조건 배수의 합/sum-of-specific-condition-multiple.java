import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        int answer = 0;
        for(int i = a; i <= b; i++){
            if(i % 5 == 0){
                answer += i;
            }
        }
        System.out.print(answer);
    }
}