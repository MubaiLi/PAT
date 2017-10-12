package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1047 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N_str = br.readLine();
		int N = Integer.parseInt(N_str);
		int[] grade = new int[1001];
		int max = 1;
		for (int i = 0; i < N; i ++) {
			String[] str1 = (br.readLine()).split(" ");
			String[] str2 = str1[0].split("-");
			int g = Integer.parseInt(str1[1]);
			int no = Integer.parseInt(str2[0]);
			grade[no] += g;
			
			if (grade[max] < grade[no]) {
				max = no;
			}
		}
		
		System.out.print(max + " " + grade[max]);
		
	}
}
