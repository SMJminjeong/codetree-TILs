import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int answer = 0;
        double average;
        int count = 0;

        for(int i = 0; i < 10; i++){
            String input = br.readLine().trim();
            int num = Integer.parseInt(input);
            if(num >= 0 && num <= 200){
                answer += num;
                count++;
            }
        }

        average = (double)answer / count;

        System.out.printf("%d %.1f", answer, average);
    }
}