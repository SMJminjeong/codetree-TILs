import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);

        boolean isExist = false;

        for(int i = a; i<=b; i++){
            if(i % c == 0){
                isExist = true;
            }
        
        }
        if(isExist){
            System.out.print("YES");
        }else{
            System.out.print("NO");

        }
        
    }
}