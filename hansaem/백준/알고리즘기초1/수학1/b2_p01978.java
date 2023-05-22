package 백준.알고리즘기초1.수학1;

import java.io.*;
import java.util.StringTokenizer;

public class b2_p01978 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/알고리즘기초1/수학1/input/p01978.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int ans = 0;
        while (st.hasMoreTokens()) {
            int tmp = Integer.parseInt(st.nextToken());
            boolean isPrime = true;
            if (tmp == 1) continue;
            else if (tmp == 2 || tmp == 3) {
            } else {
                for (int i = 2; i <= Math.sqrt(tmp); i++) {
                    if (tmp % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) ans += 1;
        }

        bw.write(ans + "");
        bw.close();
    }
}
