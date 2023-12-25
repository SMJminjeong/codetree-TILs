import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;
        for(int i = 0; i<n; i++){
            String input = br.readLine().trim();
            int num  = Integer.parseInt(input);
            answer += num;
        }
        double average = (double)answer / n;
        System.out.printf("%d %.1f", answer , average);
    }
}