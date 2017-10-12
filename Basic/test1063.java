package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class test1063 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N_str = br.readLine();
		int N = Integer.parseInt(N_str);
		double[] r = new double[N];
		for (int i = 0; i < N; i ++) {
			String[] str = (br.readLine()).split(" ");
			double a = Integer.parseInt(str[0]);
			double b = Integer.parseInt(str[1]);
			r[i] = Math.sqrt(a * a + b * b);
		}
		Arrays.sort(r);
		System.out.printf("%.2f", r[N - 1]);
	}

}