package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1062 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = (br.readLine()).split(" ");
		int K = Integer.parseInt(str[2]);
		String[] str1 = str[0].split("/");
		int N1 = Integer.parseInt(str1[0]);
		int M1 = Integer.parseInt(str1[1]);
		String[] str2 = str[1].split("/");
		int N2 = Integer.parseInt(str2[0]);
		int M2 = Integer.parseInt(str2[1]);
		if (N1 * M2 > N2 * M1) {
			int tmp = N1;
			N1 = N2; N2 = tmp;
			tmp = M1;
			M1 = M2; M2 = tmp;
		}
		int i = 1;
		while (N1 * K >= M1 * i) {
			i ++;
		}
		boolean isFirst = true;
		while (N1 * K < M1 * i && M2 * i < N2 * K) {
			if (getGcd(i, K) == 1) {
				if (isFirst) {
					System.out.print(i + "/" + K);
				} else {
					System.out.print(" " + i + "/" + K);
				}
				isFirst = false;
			}
			i ++;
		}		
	}
	
	public static int getGcd(int x, int y) {
		if (y == 0) {
			return x;
		} else {
			return getGcd(y, x%y);
		}
	}

}
