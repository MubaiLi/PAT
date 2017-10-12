package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1027 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = (br.readLine()).split(" ");
		int N = Integer.parseInt(str[0]);
		char ch = str[1].charAt(0);
		
		printCh(N, ch);
	}
	public static void printCh(int N, char ch) {
		int n = 1; int num = 1; int s = 1;
		while ((s + n) < ((N + 1) / 2)) {
			n += 2;
			num ++;
			s += n;
		}
	
		for (int i = num; i >= 1; i --) {
			for (int j = num - i; j >= 1; j --) {
				System.out.print(" ");
			}
			for (int k = i * 2 - 1; k >= 1; k --) {
				System.out.print(ch);
			}
			System.out.print("\n");
		}
		
		for (int i = 2; i <= num; i ++) {
			for (int j = num - i; j >= 1; j --) {
				System.out.print(" ");
			}
			for (int l = i * 2 - 1; l >= 1; l --) {
				System.out.print(ch);
			}
			System.out.print("\n");
		}
		
		System.out.print(N - (2 * s - 1));
	}
}
