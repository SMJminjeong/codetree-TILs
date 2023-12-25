import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        for(int i = 1; i<=a; i++){
            int mok = i / 8;
            if((i % 2 == 0 && i % 4 != 0) || (mok % 2 == 0) || (i % 7 < 4)){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}