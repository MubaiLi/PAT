package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1014 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String l1 = br.readLine();
		String l2 = br.readLine();
		String l3 = br.readLine();
		String l4 = br.readLine();
		
		printDayandHour(l1, l2);
		printMin(l3, l4);

	}
	
	public static void printDayandHour(String s1, String s2) {
		String[] week = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		int index  = 0;
		for (int i = 0; i < s1.length() && i < s2.length(); i ++) {
			if (ch1[i] >= 'A' && ch1[i] <= 'G' && ch1[i] == ch2[i]) {
			    index = i + 1;
				System.out.print(week[ch1[i] - 'A'] + " "); break;
			}
		}
		for (int i = index; i < s1.length() && i < s2.length(); i ++) {
			if (((ch1[i] >= 'A' && ch1[i] <= 'N') || (ch1[i] >= '0' && ch1[i] <= '9')) && ch1[i] == ch2[i]) {
				if (ch1[i] >= '0' && ch1[i] <= '9') {
					System.out.print("0" + ch1[i]);
				} else {
					System.out.print(ch1[i] - 'A' + 10);
				}
				break;
			}
		}
	}
	
	public static void printMin(String s1, String s2) {
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		for (int i = 0; i < s1.length() && i < s2.length(); i ++) {
			if ((ch1[i] == ch2[i]) && ((ch1[i] >= 'A' && ch1[i] <= 'Z') || (ch1[i] >= 'a' && ch1[i] <= 'z'))) {
				System.out.printf(":%02d", i); break;
			}
		}
	}

}
