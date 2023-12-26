import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean isExist = false;
        for(int i = 0; i<5; i++){
            int num = Integer.parseInt(br.readLine());
            if(num % 3 == 0){
                isExist = true;
            }else{
                break;
            }
        }
        if(isExist){
            System.out.print(1);
        }else{
            System.out.print(0);
        }
    }
}