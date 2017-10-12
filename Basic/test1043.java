package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1043 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int[] cnt = new int[6];

		for (int i = 0; i < str.length(); i ++) {
			char ch = str.charAt(i);
			switch(ch) {
				default: break;
				case 'P':
					cnt[0] ++; break;
				case 'A':
					cnt[1] ++; break;
				case 'T':
					cnt[2] ++; break;
				case 'e':
					cnt[3] ++; break;
				case 's':
					cnt[4] ++; break;
				case 't':
					cnt[5] ++; break;	
			}
		}
		
		int total = cnt[0] + cnt[1] + cnt[2] + cnt[3] + cnt[4] + cnt[5];
		while (true) {
			if (cnt[0] > 0) {
				System.out.print('P');
				cnt[0] --;
				total --;
			}
			if (cnt[1] > 0) {
				System.out.print('A');
				cnt[1] --;
				total --;
			}
			if (cnt[2] > 0) {
				System.out.print('T');
				cnt[2] --;
				total --;
			}
			if (cnt[3] > 0) {
				System.out.print('e');
				cnt[3] --;
				total --;
			}
			if (cnt[4] > 0) {
				System.out.print('s');
				cnt[4] --;
				total --;
			}
			if (cnt[5] > 0) {
				System.out.print('t');
				cnt[5] --;
				total --;
			}
			if (total == 0) {
				break;
			}
		}
		
	}

}
