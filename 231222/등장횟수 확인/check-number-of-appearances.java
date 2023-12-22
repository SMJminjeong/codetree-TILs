import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        for(int i = 0; i<5; i++){
            int num = Integer.parseInt(br.readLine().trim());

            if(num % 2 ==0){
                count++;
            }
            
        }
        System.out.print(count);
    }
}