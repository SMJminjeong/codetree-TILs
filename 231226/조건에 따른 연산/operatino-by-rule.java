import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = 0;
        while(true){
            if(n % 2 == 0){
                n = n*3 + 1;
                count++;
            }else{
                n = n*2 + 2;
                count++;
            }
            if(n >= 1000){
                System.out.print(count);
                break;
            }
        }
    }
}