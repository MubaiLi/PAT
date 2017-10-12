package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1048 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = (br.readLine()).split(" ");
		int N1 = str[0].length();
		int N2 = str[1].length();
//		int N = (N1 > N2) ? N1 : N2;
		char[] code = new char[N2];
		for (int i = 0; i < N1 && i < N2; i += 2) {
			int tmp = (Integer.parseInt(String.valueOf(str[0].charAt(N1 - 1 - i))) 
					+ Integer.parseInt(String.valueOf(str[1].charAt(N2 - 1 - i)))) % 13;
			code[N2 - 1 - i] = toCh(tmp);
		}
		for (int i = 1; i < N1 && i < N2; i += 2) {
			int tmp = Integer.parseInt(String.valueOf(str[1].charAt(N2 - 1 - i))) 
					- Integer.parseInt(String.valueOf(str[0].charAt(N1 - 1 - i)));
			if (tmp < 0) {
				tmp += 10;
				code[N2 - 1 - i] = toCh(tmp);
			} else {
				code[N2 - 1 - i] = (char) (tmp + 48);
			}
		}
		if (N1 < N2) {
			for (int i = 0; i < (N2 - N1); i ++) {
				code[i] = str[1].charAt(i);
			}
		} 
		
		
		for (int i = 0; i < N2; i ++) {
			System.out.print(code[i]);
		}
		
	}
	
	public static char toCh(int n) {
		char ch = '0';
		if (n < 10) {
			ch = (char) (n + 48);
		} else if (n == 10) {
			ch = 'J';
		} else if (n == 11) {
			ch = 'Q';
		} else if (n == 12) {
			ch = 'K';
		}
		return ch;
	}

}
