import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for(int i = 0; i<num; i++){
            for(int j = num; j>i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 0; i<num-1; i++){
            for(int j = 0; j<=i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}