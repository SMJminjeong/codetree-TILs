import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i<= n; i++){
            if((i % 2 == 0) || (i % 10 == 5) || (i % 3 == 0 && i % 9 != 0)){
                continue;
            }else{
                System.out.print(i + " ");
            }
        }
    }
}