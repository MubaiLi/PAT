package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1029 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = (br.readLine()).toUpperCase();
		String str_broken = (br.readLine()).toUpperCase();
		char[] ch1 = str.toCharArray();
		char[] ch2 = str_broken.toCharArray();
		boolean isEqual;
		char[] brokenKey = new char[ch1.length]; int n = 0;
		
		for (int i = 0; i < ch1.length; i ++) {
			isEqual = false;
			for (int j = 0; j < ch2.length; j ++) {
				if (ch1[i] == ch2[j]) {
					isEqual = true; break;
				}
			}
			if (!isEqual) {
				brokenKey[n ++] = ch1[i];
			}
		}
		for (int i = 1; i < n; i ++) {
			for (int j = 0; j < i; j ++) {
				if (brokenKey[i] == brokenKey[j]) {
					brokenKey[i] = '*'; break;
				}
			}
		}
		
		for (int i = 0; i < n; i ++) {
			if (brokenKey[i] != '*') {
				System.out.print(brokenKey[i]);
			}
			
		}
		
	}
	

}
