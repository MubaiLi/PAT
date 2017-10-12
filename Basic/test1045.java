package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class test1045 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N_str = br.readLine();
		int N = Integer.parseInt(N_str);
		String[] str = (br.readLine()).split(" ");
		int[] num = new int[N];
		int[] tmp = new int[N];
		for (int i = 0; i < N; i ++) {
			num[i] = Integer.parseInt(str[i]);
			tmp[i] = num[i];
		}
		
		Arrays.sort(num);
		
		int max = 0; int cnt = 0;
		int[] n = new int[N];
		for (int i = 0; i < N; i ++) {
			if (num[i] == tmp[i] && tmp[i] > max) {
				n[cnt ++] = tmp[i];
			}
			if (tmp[i] > max) {
				max = tmp[i];
			}
		}
		
		System.out.println(cnt);
		for (int i = 0; i < cnt; i ++) {
			if (i != 0) {
				System.out.print(" ");
			}
			System.out.print(n[i]);
		}
		
	}

}
