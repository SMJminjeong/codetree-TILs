import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for(int i = 1; i <= n; i++) {
            if(i % 3 == 0 || String.valueOf(i).matches(".*[369].*")) System.out.print(0 + " ");
            else System.out.print(i + " ");
        }
    }
}