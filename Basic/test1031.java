package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1031 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N_str = br.readLine();
		int	N = Integer.parseInt(N_str);
		boolean isAllPassed = true;
		String[] str = new String[N];
		for (int i = 0; i < N; i ++) {
			str[i] = br.readLine();
		}
		for (int i = 0; i < N; i ++) {
			if (!checkM(str[i])) {
				isAllPassed = false;
				System.out.println(str[i]);
			}
		}

		if (isAllPassed) {
			System.out.println("All passed");
		}
			
	}
	
	public static boolean checkM(String str) {
		int[] w = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
		char[] m = {'1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2'};
		int z = 0;
		for (int i = 0; i < str.length() - 1; i ++) {
			z += w[i] * (str.charAt(i) - '0');
		}
		z = z % 11;
		if (str.charAt(str.length() - 1) == m[z]) {
			return true;
		}
		return false;
	}

}
