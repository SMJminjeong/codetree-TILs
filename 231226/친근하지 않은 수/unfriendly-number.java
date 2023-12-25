import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count = 0;
        for(int i = 1; i<=n; i++){
            if(i % 2 == 0 || i % 3 == 0 || i % 5 == 0){
                continue;
            }else{
                count++;
            }
            
        }
        System.out.print(count);
    }
}