import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i = 1; i<=n; i++){
            if(n % i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.print("P");
        }else{
            System.out.print("C");
        }
    }
}