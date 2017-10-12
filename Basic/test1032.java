package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1032 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N_str = br.readLine();
		int	N = Integer.parseInt(N_str);
		int[] grade = new int[100001];
		int max = 1;

		for (int i = 0; i < N; i ++) {
			String[] str = (br.readLine()).split(" ");
			int no = Integer.parseInt(str[0]);		
			grade[no] += Integer.parseInt(str[1]);
			
			if (grade[max] < grade[no]) {
				max = no;
			}
		}
		
		System.out.print(max + " " + grade[max]);	
	}

}