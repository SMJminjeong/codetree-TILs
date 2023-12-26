import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int target = 0;
        double average = 0;

        while(true){
            String input = br.readLine();

            if(input.isEmpty()){
                break;
            }
            int num = Integer.parseInt(input);
            

            if(num / 10 == 2){
                count++;

                target += num;
                average = (double)target/count;
            }else{
                System.out.printf("%.2f", average);
                break;
            }
        }
    }
}