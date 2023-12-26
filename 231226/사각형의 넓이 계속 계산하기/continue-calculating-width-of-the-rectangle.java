import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String str = br.readLine();

            if(str.isEmpty()){
                break;
            }
            String[] input = str.split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            String alphabet = input[2];

            if (!alphabet.equals("C")) {
                System.out.println(a * b);
            } else if (alphabet.equals("C")) {
                System.out.println(a * b);
                break;
            }
        }
    }
}