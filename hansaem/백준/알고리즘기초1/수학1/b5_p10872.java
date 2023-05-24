package 백준.알고리즘기초1.수학1;

import java.io.*;
import java.util.StringTokenizer;

public class b5_p10872 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/알고리즘기초1/수학1/input/p10872.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int ans = 1;
        for (int i = 2; i <= N; i++) {
            ans *= i;
        }

        bw.write(ans + "");
        bw.close();
    }
}
