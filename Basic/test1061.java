package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1061 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] N_str = (br.readLine()).split(" ");
		int N = Integer.parseInt(N_str[0]);
		int M = Integer.parseInt(N_str[1]);
		String[] str1 = (br.readLine()).split(" ");
		String[] str2 = (br.readLine()).split(" ");
		int[] full = new int[M];
		int[] rightAns = new int[M];
		for (int i = 0; i < M; i ++) {
			full[i] = Integer.parseInt(str1[i]);
			rightAns[i] = Integer.parseInt(str2[i]);
		}
		
		int[] grade = new int[N];
		for (int i = 0; i < N; i ++) {
			String[] str = (br.readLine()).split(" ");
			for (int j = 0; j < M; j ++) {
				if (Integer.parseInt(str[j]) == rightAns[j]) {
					grade[i] += full[j];
				}
			}
		}
		
		for (int i = 0; i < N; i ++) {
			System.out.println(grade[i]);
		}
		
		
	}

}
