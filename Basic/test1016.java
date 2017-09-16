package Basic;
import java.io.*;

public class test1016 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = (br.readLine()).split(" ");
	
		int DA = Integer.parseInt(str[1]);
		int DB = Integer.parseInt(str[3]);
		char[] A = str[0].toCharArray();
		char[] B = str[2].toCharArray();
		int cntA = 0; int cntB = 0;
		for (int i = 0; i < A.length; i ++) {
			if (A[i] == str[1].charAt(0)) {
				cntA ++;
			}
		}
		for (int i = 0; i < B.length; i ++) {
			if (B[i] == str[3].charAt(0)) {
				cntB ++;
			}
		}
		System.out.println(valueP(DA, cntA)+ valueP(DB, cntB));

	}
	
	public static int valueP (int x, int l) {
		int p = 0;
		for (int i = 0; i < l; i ++) {
			p = 10 * p + x;
		}
		return p;
	}

}
