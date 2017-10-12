package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1033 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str_broken = br.readLine();
		String str = br.readLine();
		char[] ch1 = str_broken.toCharArray();
		char[] ch2 = str.toCharArray();
		
		boolean hasSpace = false;
		boolean hasPlus = false;
		
		if (str_broken.contains("_")) {
			hasSpace = true;
		}
		if (str_broken.contains("+")) {
			hasPlus = true;
		}
		
		for(int i = 0; i < ch2.length; i ++) {
			if (hasSpace && ch2[i] == '_') {
				ch2[i] = '*'; continue;
			}
			if (hasPlus && (ch2[i] >= 'A' && ch2[i] <= 'Z')) {
				ch2[i] = '*'; continue;
			}
			for (int j = 0; j < ch1.length; j ++) {
				if (ch2[i] == ch1[j] || Character.toUpperCase(ch2[i]) == ch1[j]) {
					ch2[i] = '*'; break;
				}
			}
		}
		
		for (int i = 0; i < ch2.length; i ++) {
			if (ch2[i] != '*') {
				System.out.print(ch2[i]);
			}
			
		}
		
	}

}
