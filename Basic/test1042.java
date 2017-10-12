package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1042 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = (br.readLine()).toLowerCase();
		int[] cnt = new int[26];
		
		for(int i = 0; i <str.length(); i ++) {
			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				cnt[ch - 'a'] ++;
			} else if (ch >= 'A' && ch <= 'Z') {
				cnt[ch - 'A'] ++;
			}
		}
		int max = 0;
		for (int i = 0; i < 26; i ++) {
			if (cnt[i] > cnt[max]) {
				max = i;
			}
		}
		char m = (char) (max + 'a');
		System.out.print(m + " " + cnt[max]);
		
	}

}
