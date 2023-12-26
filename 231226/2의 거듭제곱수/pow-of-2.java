import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        
        int x = 0;
        int answer = 2;
        while (num > 1) {
            num /= 2;
            x++;
        }
        System.out.print(x);
    }
}