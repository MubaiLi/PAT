package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1024 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char[] N = str.toCharArray();
		
		int index = 0; int k = N.length;
		for (int i = 0; i < k; i ++) {
			if (N[i] == 'E') {
				index = i;
				break;
			}
		}
		int exp = 0; int j = 1;
		for (int i = k - 1; i >= index + 2; i --) {
			exp += j * Integer.parseInt(String.valueOf(N[i]));
			j = j * 10;
		}
		
		if (N[0] == '-') {
			System.out.print('-');
		}
		
		if (N[index + 1] == '+') {
			System.out.print(N[1]);
			if (exp > (index - 3)) {
				for (int i = 3; i < index; i ++) {
					System.out.print(N[i]);
				}
				int n_exp = exp - (index - 3);
				for (int i = 0; i < n_exp; i ++) {
					System.out.print('0');
				}
			} else if(exp == (index - 3)) {
				for (int i = 3; i < index; i ++ ) {
					System.out.print(N[i]);
				}
			} else {
				for (int i = 3; i < (index - exp - 1); i ++ ) {
					System.out.print(N[i]);
				}
				System.out.print('.');
				for (int i = (index - exp - 1); i < index; i ++ ) {
					System.out.print(N[i]);
				}
			}
		} else {
			System.out.print("0.");
			int n_exp = exp - 1;
			if (n_exp != 0) {
				for (int i = 0; i < n_exp; i ++) {
					System.out.print('0');
				}
				System.out.print(N[1]);
				for (int i = 3; i < index; i ++) {
					System.out.print(N[i]);
				}
			} else {
				System.out.print(N[1]);
				for (int i = 3; i < index; i ++) {
					System.out.print(N[i]);
				}
			}
		}
	}
}