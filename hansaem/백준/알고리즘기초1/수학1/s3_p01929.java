package 백준.알고리즘기초1.수학1;

import java.io.*;
import java.util.StringTokenizer;

public class s3_p01929 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/알고리즘기초1/수학1/input/p01929.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        boolean isNotPrimes[] = new boolean[N + 1];

        isNotPrimes[0] = true;
        isNotPrimes[1] = true;
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (isNotPrimes[i]) continue;
            for (int j = i + i; j <= N; j += i) {
                isNotPrimes[j] = true;
            }
        }
        for (int i = M; i <= N; i++) {
            if (isNotPrimes[i]) continue;
            sb.append(i).append("\n");
        }

        bw.write(sb.toString());
        bw.close();
    }
}
