import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i<n; i++){
            int num = Integer.parseInt(br.readLine());

            if (num % 2 != 0 && num % 3 == 0) {
                System.out.println(num); 
            }
        }
    }   
}