package 백준.알고리즘기초1.수학1;

import java.io.*;
import java.util.StringTokenizer;

public class s1_p06588 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/알고리즘기초1/수학1/input/p06588.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;// = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        boolean prime[] = new boolean[1000001];
        prime[0] = prime[1] = true; // 소수는 false
        for (int i = 2; i < prime.length; i++) {
            if (!prime[i]) {
                for (int j = i + i; j < prime.length; j += i) {
                    prime[j] = true;
                }
            }
        }

        String str;
        while ((str = br.readLine()) != null) {
            int n = Integer.parseInt(str);
            if (n == 0) break;
            boolean isProve = false;

            for (int i = 2; i <= n / 2; i++) {
                if (!prime[i] && !prime[n - i]) {
                    sb.append(n + " = " + i + " + " + (n - i)).append("\n");
                    isProve = true;
                    break;
                }
            }

            if (!isProve) sb.append("Goldbash's conjecture is wrong").append("\n");
        }

        bw.write(sb.toString());
        bw.close();
    }
}
