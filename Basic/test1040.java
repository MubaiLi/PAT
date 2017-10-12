package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1040 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int cntP = 0, cntPA = 0, cntPAT = 0;
		for (int i = 0; i < str.length(); i ++) {
			char ch = str.charAt(i);
			if (ch == 'P') {
				cntP ++;
			} else if (ch == 'A') {
				cntPA += cntP;
			} else if (ch == 'T') {
				cntPAT += cntPA;
				cntPAT = cntPAT % 1000000007;
			}
		}
		
		System.out.print(cntPAT);
	}

}