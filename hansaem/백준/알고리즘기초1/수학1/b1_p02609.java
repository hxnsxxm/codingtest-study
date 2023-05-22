package 백준.알고리즘기초1.수학1;

import java.io.*;
import java.util.StringTokenizer;

public class b1_p02609 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/알고리즘기초1/수학1/input/p02609.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int gcd = 1, lcm = 1;
        int min = A < B ? A : B;
        int max = A < B ? B : A;
        if (max / min == 0) {
            gcd = min;
            lcm = max;
        } else {
            while (true) {
                boolean exit = true;
                for (int i = 2; i <= min; i++) {
                    if (A % i == 0 && B % i == 0) {
                        exit = false;
                        A /= i;
                        B /= i;
                        gcd *= i;
                        break;
                    }
                }
                if (exit) break;
            }
            lcm = A * B * gcd;
        }

        bw.write(gcd + "\n" + lcm);
        bw.close();
    }
}
