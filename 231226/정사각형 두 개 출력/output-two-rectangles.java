import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for(int i = 0; i<num * 2; i++){
            for(int j = 0; j<num; j++){
                System.out.print("*");
            }
            System.out.println();
            if(i == num-1){
                System.out.println();
            }
        }
    }
}