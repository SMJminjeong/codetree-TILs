import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int x = 1;
        while(true){
            int answer = 2 * x;
            if(answer == num){
                System.out.print(x);
                break;
            }
            x++;
        }
    }
}