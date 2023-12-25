import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            int num = Integer.parseInt(br.readLine());
            if(num <25){
                System.out.println("Higher");
            }else if(num > 25){
                System.out.println("Lower");
            }else{
                System.out.println("Good");
                break;
            }
        }
    }
}