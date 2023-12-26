import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String input = br.readLine();
            if (input == null) {
                break;
            }

            int num = Integer.parseInt(input);
            int count = 0;
            if(num % 2 == 0){
                count++;
                System.out.println(num/2);
                if(count ==3){
                    break;
                }
            }

        }
    }
}