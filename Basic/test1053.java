package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1053 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] N_str = (br.readLine()).split(" ");
		int N = Integer.parseInt(N_str[0]);
		double E = Double.parseDouble(N_str[1]);
		int D = Integer.parseInt(N_str[2]);
		int numPossible = 0, numEmpty = 0;
		for (int i = 0; i < N; i ++) {
			String[] str = (br.readLine()).split(" ");
			int K = Integer.parseInt(str[0]);
			int cntE = 0;
			for (int j = 1; j < K; j ++) {
				double e = Double.parseDouble(str[j]);
				if (e < E) {
					cntE ++;
				}
			}
			if (cntE > K / 2) {
				numPossible ++;
				if (K > D) {
					numEmpty ++;
					numPossible --;
				}
			}
		}
		
		double ratePossible = numPossible * 1.0 / N * 100;
		double rate = numEmpty * 1.0 / N * 100;
		
		System.out.printf("%.1f%% %.1f%%", ratePossible, rate);
		
	}

}
