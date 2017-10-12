package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1066 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] N_str = br.readLine().split(" ");
		int M = Integer.parseInt(N_str[0]);
		int N = Integer.parseInt(N_str[1]);
		int A = Integer.parseInt(N_str[2]);
		int B = Integer.parseInt(N_str[3]);
		int G = Integer.parseInt(N_str[4]);
		for (int i = 0; i < M; i ++) {
			int[] gray = new int[N];
			String[] str = br.readLine().split(" ");
			boolean isFirst = true;
			for (int j = 0; j < N; j ++) {
				int g = Integer.parseInt(str[j]);
				if (g >= A && g <= B) {
					g = G;
				}
				gray[j] = g;
				if (isFirst) {
					System.out.printf("%03d", gray[j]);
					isFirst = false;
				} else {
					System.out.printf(" %03d", gray[j]);
				}
			}
			System.out.printf("\n");
		}
				
	}

}
