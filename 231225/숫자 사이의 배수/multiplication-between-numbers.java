import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        int answer = 0;
        int count = 0;
        double average;

        for(int i = a; i<=b; i++){
            if(i % 5 == 0 || i % 7 == 0){
                answer += i;
                count++;
            }
        }
        average = (double)answer / count;

        System.out.printf("%d %.1f", answer, average);
    }
}