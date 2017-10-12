package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1039 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		int cnt = 0;
		for (int i = 0; i < ch2.length; i ++) {
			for (int j = 0; j < ch1.length; j ++) {
				if (ch1[j] == ch2[i]) {
					cnt ++;
					ch1[j] = '*'; break;
				}
			}
		}
		
		if (cnt == ch2.length) {
			int n = ch1.length - ch2.length;
			System.out.print("Yes " + n);
		} else {
			int n = ch2.length - cnt;
			System.out.print("No " + n);
		}	
	}

}
