package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1037 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = (br.readLine()).split(" ");
		String[] P = (str[0]).split("\\.");
		String[] A = (str[1]).split("\\.");
		int[] p = new int[3];
		int[] a = new int[3];
		for (int i = 0; i < 3; i ++) {
			p[i] = Integer.parseInt(P[i]);
			a[i] = Integer.parseInt(A[i]);
		}	

		if (a[0] > p[0]) {
			print(a, p, true);
		} else {
			print(p, a, false);
		}
	}
	
	public static void print(int[] a, int[] b, boolean flag) {
		int g = a[0];
		int s = a[1];
		int k = a[2] - b[2];
		if (k < 0) {
			k += 29;
			s -= 1;
		}
		s -= b[1];
		if (s < 0) {
			s += 17;
			g -= 1;
		}
		g -= b[0];
		
		if (!flag) {
			System.out.print("-");
		}
		System.out.print(g + "." + s + "." + k);
	}

}
