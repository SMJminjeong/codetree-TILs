import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int count = 0;
        while(true){
            if(num % 2 == 0){
                count++;
                num /= 2;
                if(num == 1){
                    System.out.print(count);
                    break;
                }
            }else if(num == 1){
                System.out.print(count);
                break;
            }else{
                count++;
                num = num*3 +1;
                if(num == 1){
                    System.out.print(count);
                    break;
                }
            }
        }
    }
}