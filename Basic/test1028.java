package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1028 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str);
		int year; int month; int day; int cnt = 0; String name;
		int maxY = 0, maxM = 0, maxD = 0; String maxN = "";
		int minY = 9999, minM = 9999, minD = 9999; String minN = "";

		for (int i = 0; i < N; i ++) {
			String[] birth_str = (br.readLine()).split(" ");
			name = birth_str[0];
			String[] birth = (birth_str[1]).split("/");
			year = Integer.parseInt(birth[0]);
			month = Integer.parseInt(birth[1]);
			day = Integer.parseInt(birth[2]);
			
			if ((year < 2014 || (year == 2014 && month < 9) || (year == 2014 && month == 9 && day <= 6)) &&
			           (year > 1814 || (year == 1814 && month > 9) || (year == 1814 && month == 9 && day >= 6))) {
				cnt ++;
				if(year > maxY || (year == maxY && month > maxM) || (year == maxY && month == maxM && day > maxD)) {
	                maxY = year;
	                maxM = month;
	                maxD = day;
	                maxN = name;
	            }
				if(year < minY || (year == minY && month < minM) || (year == minY && month == minM && day < minD)) {
	                minY = year;
	                minM = month;
	                minD = day;
	                minN = name;
	            }
			}
		}
		System.out.print(cnt);
		if (cnt != 0) {
			System.out.print(" " + minN + " " + maxN);
		}
	}
}
