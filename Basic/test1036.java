package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1036 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = (br.readLine()).split(" ");
		int N = Integer.parseInt(str[0]);
		char ch = str[1].charAt(0);
		int L = (int) Math.round(N / 2.0);
		for (int i = 0; i < L; i ++) {
			if (i == 0 || i == (L - 1)) {
				for (int j = 0; j < N; j ++) {
					System.out.print(ch);
				}
				System.out.print('\n');
			} else {
				System.out.print(ch);
				for (int j = 1; j < N - 1; j ++) {
					System.out.print(" ");
				}
				System.out.print(ch);
				System.out.print('\n');
			}
		}
	}
}
