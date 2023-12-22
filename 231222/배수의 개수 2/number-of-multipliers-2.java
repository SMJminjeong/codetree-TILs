import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        for(int i = 0; i<10; i++){
            int num = Integer.parseInt(br.readLine());
            if(num % 2 == 1){
                count++;
            }
        }
        System.out.print(count);

    }
}