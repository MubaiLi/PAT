package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1071 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] N_str = br.readLine().split(" ");
		int T = Integer.parseInt(N_str[0]);
		int K = Integer.parseInt(N_str[1]);
		
		for (int i = 0; i < K; i ++) {
			String[] str = br.readLine().split(" ");
			int n1 = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			int t = Integer.parseInt(str[2]);
			int n2 = Integer.parseInt(str[3]);
			
			if (T <= 0) {
				System.out.println("Game Over."); break;
			} else if (t > T) {
				System.out.printf("Not enough tokens.  Total = %d.\n", T);
			} else {
				if ((n1 > n2 && b == 0) || (n1 < n2 && b == 1)) {
					T += t;
					System.out.printf("Win %d!  Total = %d.\n", t, T);
				} else if ((n1 < n2 && b == 0) || (n1 > n2 && b == 1)) {
					T -= t;
					System.out.printf("Lose %d.  Total = %d.\n", t, T);
				}
			}
		}
		
	}

}
