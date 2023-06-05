package 백준.알고리즘기초1.수학1_연습;

import java.io.*;
import java.util.StringTokenizer;

public class s4_p09613 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/알고리즘기초1/수학1_연습/input/p09613.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(st.nextToken());
        for (int t = 0; t < testCase; t++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int[] num = new int[N];
            long sum = 0;
            for (int n = 0; n < N; n++) {
                num[n] = Integer.parseInt(st.nextToken());
            }

            for (int i = 0; i < N - 1; i++) {
                for (int j = i + 1; j < N; j++) {
                    int n1 = num[i];
                    int n2 = num[j];

                    for (int k = n1; k > 0; k--) {
                        if (n1 % k == 0 && n2 % k == 0) {
                            sum += k;
                            break;
                        }
                    }
                }
            }

            sb.append(sum).append("\n");
        }


        bw.write(sb.toString());
        bw.close();
    }
}
