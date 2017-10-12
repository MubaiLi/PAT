package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1026 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = (br.readLine()).split(" ");
		int c1 = Integer.parseInt(str[0]);
		int c2 = Integer.parseInt(str[1]);
		int CLK_TCK = 100;
		int sec = (int) ((c2 - c1) * 1.0 / CLK_TCK + 0.5 );
		int h = sec / 3600;
		int m = (sec - 3600 * h) / 60;
		int s = sec - 3600 * h - 60 * m;
		System.out.printf("%02d:%02d:%02d", h, m, s);
	}
}
