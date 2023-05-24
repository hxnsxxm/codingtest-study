package 백준.알고리즘기초1.수학1;

import java.io.*;
import java.util.StringTokenizer;

public class s5_p01676 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/알고리즘기초1/수학1/input/p01676.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int ans = 0;

        while (N >= 5) {
            ans += N / 5;
            N /= 5;
        }

        //시간초과 1
//        long mult = 1;
//        for (int i = 2; i <= N; i++) {
//            mult *= i;
//        }
//        int ans = 0;
//        while (mult % 10 == 0) {
//            ans += 1;
//            mult /= 10;
//        }

        bw.write(ans + "");
        bw.close();
    }
}
