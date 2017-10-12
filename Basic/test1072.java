package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1072 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] N_str = br.readLine().split(" ");
		int N = Integer.parseInt(N_str[0]);
		int M = Integer.parseInt(N_str[1]);
		int[] type = new int[M];
		String[] typeStr = br.readLine().split(" ");
		for (int i = 0; i < M; i ++) {
			type[i] = Integer.parseInt(typeStr[i]);
		}
		int fullCnt = 0, stuCnt = 0;
		for (int i = 0; i < N; i ++) {
			String[] str = br.readLine().split(" ");
			int n = Integer.parseInt(str[1]);
			if (n == 0) {
				continue;
			}
			int p = 0;
			int[] ans = new int[M];
			int eachCnt = 0;
			for (int j = 0; j < n; j ++) {
				int no = Integer.parseInt(str[j + 2]);
				for (int k = 0; k < M; k ++) {
					if (no == type[k]) {
						ans[p ++] = no;
						fullCnt ++;
						eachCnt ++;
						break;
					}
				}
			}
			if (eachCnt > 0) {
				stuCnt ++;
				System.out.print(str[0] + ":");
				for (int j = 0; j < p; j ++) {
					System.out.printf(" %04d", ans[j]);
				}
				System.out.printf("\n");
			}
		}
		System.out.print(stuCnt + " " + fullCnt);
		
	}

}
