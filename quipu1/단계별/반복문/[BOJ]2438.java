package basic;

import java.io.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String str = "*";

        for (int i=1; i<n+1; i++) {
            bw.write(str.repeat(i));
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();

    }
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}