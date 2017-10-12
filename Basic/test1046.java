package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1046 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N_str = br.readLine();
		int N = Integer.parseInt(N_str);
		
		int cnt_a = 0, cnt_b = 0;
		for (int i = 0; i < N; i ++) {
			String[] str = (br.readLine()).split(" ");
			int s = Integer.parseInt(str[0]) + Integer.parseInt(str[2]);
			int a = Integer.parseInt(str[1]);
			int b = Integer.parseInt(str[3]);
			if (s == a && s != b) {
				cnt_b ++;
			} else if (s != a && s == b) {
				cnt_a ++;
			}
		}
		
		System.out.print(cnt_a + " " + cnt_b);
		
	}
}
