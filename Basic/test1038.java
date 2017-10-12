package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1038 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N_str = br.readLine();
		int N = Integer.parseInt(N_str);
		String[] grade_str = (br.readLine()).split(" ");
		String[] str = (br.readLine()).split(" ");
		int[] grade = new int[N];
		for (int i = 0; i < N; i ++) {
			grade[i] = Integer.parseInt(grade_str[i]);
		}
		int k = Integer.parseInt(str[0]);
		int[] search = new int[k];
		for (int i = 0; i < k; i ++) {
			int num = Integer.parseInt(str[i + 1]);
			for (int j = 0; j < N; j ++) {
				if (grade[j] == num) {
					search[i] ++;
				}
			}
		}
		
		for (int i = 0; i < k - 1; i ++) {
			System.out.print(search[i] + " ");
		}
		System.out.print(search[k - 1]);
		
	}

}
