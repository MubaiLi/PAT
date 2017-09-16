package Basic;
import java.io.*;


public class test1017 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = (br.readLine()).split(" ");
		char[] A = str[0].toCharArray();
		int B = Integer.parseInt(str[1]);
		int n = A.length;
		char[] Q = new char[n];
		int R = 0;
		for (int i = 0; i < n; i ++) {
			int num = Character.getNumericValue(A[i]);
			int q = (num + 10 * R) / B;
			R = (num + 10 * R) % B;
			Q[i] = String.valueOf(q).charAt(0);
		}
		if (Q[0] == '0') {
			char[] Q1 = new char[n - 1];
			for (int i = 0; i < (n - 1); i ++) {
				Q1[i] = Q[i + 1];
			}
			System.out.println(String.valueOf(Q1) + " " + R);
		} else {
			System.out.println(String.valueOf(Q) + " " + R);
		}

	}

}
