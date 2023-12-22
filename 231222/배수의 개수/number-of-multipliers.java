import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt3 = 0;
        int cnt5 = 0;

        for(int i = 0; i< 10; i++){
            int num = Integer.parseInt(br.readLine().trim());
            if(num % 3 == 0){
                cnt3++;
            }
            if (num % 5 == 0){
                cnt5++;
            }
        }
        System.out.print(cnt3 + " "+ cnt5);
    }
}