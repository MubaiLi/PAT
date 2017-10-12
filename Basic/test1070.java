package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class test1070 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] rope = new int[N];
		String[] str = br.readLine().split(" ");
		for (int i = 0; i < N; i ++) {
			rope[i] = Integer.parseInt(str[i]);
		}
		
		Arrays.sort(rope);
		
		int len = rope[0];
		for (int i = 1; i < N; i ++) {
			len = (len + rope[i]) / 2;
		}
		
		System.out.print(len);
		
	}

}
