package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1057 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = (br.readLine()).toLowerCase();
		char[] ch = str.toCharArray();
		int sum = 0;
		for (int i = 0; i < ch.length; i ++) {
			if (ch[i] >= 'a' && ch[i] <= 'z') {
				int n = (int) ch[i] - 96;
				sum += n;
			}
		}
		
		if (sum == 0) {
			System.out.print("0 0");
		} else {
			int cnt0 = 0, cnt1 = 0;
			do {
	        	int i = (int) (sum % 2);
	        	sum /= 2;
	        	if (i == 0) {
	        		cnt0 ++;
	        	} else {
	        		cnt1 ++;
	        	}
	        } while (sum != 0);
			
			System.out.print(cnt0 + " " + cnt1);
		}	
        
	}

}
