import java.io.*;
public class Main{
    public static void main(String[] args)  throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine().trim());

        int cnt2 = 0;
        int cnt3 = 0;
        int cnt12 = 0;

        for(int i = 1; i<num; i++){
            if(i % 2 == 0 && i % 6 != 0){
                cnt2++;
            }
            if(i % 3 == 0 && i % 12 != 0){
                cnt3++;
            }
            if(i % 12 == 0){
                cnt12++;
            }
        }
        System.out.print(cnt2 + " " + cnt3 + " " + cnt12);
    }
}