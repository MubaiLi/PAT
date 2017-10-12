package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1044 {
	static String[] units = {"tret", "jan", "feb", "mar", "apr", "may", "jun", "jly", "aug", "sep", "oct", "nov", "dec"};
	static String[] tens = {"tret", "tam", "hel", "maa", "huh", "tou", "kes", "hei", "elo", "syy", "lok", "mer", "jou"};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N_str = br.readLine();
		int N = Integer.parseInt(N_str);
		String[] str = new String[N];
		for (int i = 0; i < N; i ++) {
			str[i] = br.readLine();
		}
		for (int i = 0; i < N; i ++) {
			if (str[i].charAt(0) >= '0' && str[i].charAt(0) <= '9') {
				earthToMars(str[i]);
			} else {
				marsToEarth(str[i]);
			}
		}
		
		
	}
	
	public static void earthToMars (String str) {
		int n = Integer.parseInt(str);
		int[] ans = new int[2];
		int num = 0;
        do {
        	ans[num] = n % 13;
        	num ++;
        	n /= 13;
        } while (n != 0);
        if (ans[1] == 0) {
        	System.out.println(units[ans[0]]);
        } else {
        	System.out.println(tens[ans[1]] + " "+ units[ans[0]]);
        }
	}
	
	public static void marsToEarth (String str) {
		int unit, ten;
		String[] s = str.split(" ");
		if (s.length == 1) {
			unit = findIndex(str, units);
			if (unit < 13) {
				System.out.println(unit);
			} else {
				ten = findIndex(str, tens);
				System.out.println(13 * ten);
			}
		} else {
			ten = findIndex(s[0], tens);
			unit = findIndex(s[1], units);
			int n = 13 * ten + unit;
			System.out.println(n);
		}
		
	}
	
	public static int findIndex (String s, String[] str) {
		for (int i = 0; i < str.length; i ++) {
			if (s.equals(str[i])) {
				return i;
			}
		}
		return 13;
	}

}
