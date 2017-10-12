package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class test1030 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = (br.readLine()).split(" ");
		int N = Integer.parseInt(str[0]);
		int p = Integer.parseInt(str[1]);
		String[] strNum = (br.readLine()).split(" ");
		int[] num = new int[N];
		int n = 0;
		for (int i = 0; i < N; i ++) {
			num[i] = Integer.parseInt(strNum[i]);
		}
		
		Arrays.sort(num);                                          
		
		for (int i = 0; i < N; i ++) {
			for (int j = i + n; j < N; j ++) {
				if (num[j] > num[i] * p) {
					break;
				}
				n ++;
			}
		}
		
		System.out.print(n);
	}
}
