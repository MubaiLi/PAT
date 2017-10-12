package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1056 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = (br.readLine()).split(" ");
		int N = Integer.parseInt(str[0]);
		int[] num = new int[N];
		for (int i = 0; i < N; i ++) {
			num[i] = Integer.parseInt(str[i + 1]);
		}
		
		int sum = 0;
		for (int i = 0; i < N - 1; i ++) {
			for (int j = i + 1; j < N; j ++) {
				sum += 11 * (num[i] + num[j]);
			}
		}
		
		System.out.print(sum);	
	}

}
