package basic;

import java.io.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int score = Integer.parseInt(br.readLine());

        if (score >= 90) {
            bw.write("A");
        } else if (score >= 80) {
            bw.write("B");
        } else if (score >= 70) {
            bw.write("C");
        } else if (score >= 60) {
            bw.write("D");
        } else {
            bw.write("F");
        }

        bw.flush();
        br.close();
        bw.close();
    }
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}