import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine().trim());
        int count = 0;
        for(int i = 1; i<year; i++){
            if(i % 4 == 0 || (i % 4 == 0 && i % 400 == 0)){
                count++;
            }
        }
        System.out.print(count);
    }
}