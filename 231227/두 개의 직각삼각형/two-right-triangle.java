import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            // 왼쪽 별표 출력
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            // 가운데 공백 출력
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }

            // 오른쪽 별표 출력
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}