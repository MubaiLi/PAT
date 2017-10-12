package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1074 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		int N = str.length();
		int N1 = str1.length(); int N2 = str2.length();
		if (N1 < N2) {
			String tmp = str1;
			str1 = str2;
			str2 = tmp;
			N1 = str1.length();
			N2 = str2.length();
		}
		
		int s = 0;
		int[] n = new int[N + 1];
		for (int i = 0; i < N2; i ++) {
			int a = Integer.parseInt(String.valueOf(str1.charAt(N1 - 1 - i)));
			int b = Integer.parseInt(String.valueOf(str2.charAt(N2 - 1 - i)));
			int d = Integer.parseInt(String.valueOf(str.charAt(N - 1 - i)));
			if (d == 0) {
				d = 10;
			}
			n[N - i] = (a + b + s) % d;
			s = (a + b + s) / d;
		}
		for (int i = N2; i < N1; i ++) {
			int a = Integer.parseInt(String.valueOf(str1.charAt(N1 - 1 - i)));
			int d = Integer.parseInt(String.valueOf(str.charAt(N - 1 - i)));
			if (d == 0) {
				d = 10;
			}
			n[N - i] = (a + s) % d;
			s = (a + s) / d;
		}
		if (s != 0) {
			n[N - N1] = s;
		}
		print(n);	
	}
	
	public static int[] add (String str, String str1, String str2) {
		int N = str.length();
		int N1 = str1.length();
		int N2 = str2.length();
		int s = 0;
		int[] n = new int[N + 1];
		for (int i = 0; i < N2; i ++) {
			int a = Integer.parseInt(String.valueOf(str1.charAt(N1 - 1 - i)));
			int b = Integer.parseInt(String.valueOf(str2.charAt(N2 - 1 - i)));
			int d = Integer.parseInt(String.valueOf(str.charAt(N - 1 - i)));
			if (d == 0) {
				d = 10;
			}
			n[N - i] = (a + b + s) % d;
			s = (a + b + s) / d;
		}
		for (int i = N2; i < N1; i ++) {
			int a = Integer.parseInt(String.valueOf(str1.charAt(N1 - 1 - i)));
			int d = Integer.parseInt(String.valueOf(str.charAt(N - 1 - i)));
			if (d == 0) {
				d = 10;
			}
			n[N - i] = (a + s) % d;
			s = (a + s) / d;
		}
		if (s != 0) {
			n[N - N1] = s;
		}
		return n;
	}
	
	public static void print(int[] n) {
		int index = 0;
		boolean isZero = true;
		for (int i = 0; i < n.length; i ++) {
			if (n[i] != 0) {
				index = i;
				isZero = false;
				break;
			}
		}
		if (isZero) {
			System.out.print(0);
		} else {
			for (int i = index; i < n.length; i ++) {
				System.out.print(n[i]);
			}
		}
	}
	
}
