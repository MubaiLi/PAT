package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class test1050 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N_str = br.readLine();
		int N = Integer.parseInt(N_str);
		String[] str = (br.readLine()).split(" ");
		int[] num = new int[N];
		for (int i = 0; i < N; i ++) {
			num[i] = Integer.parseInt(str[i]);
		}
		int m = 1, n = 1; int min = 100001;
		for (int i = 1; i <= Math.sqrt(N); i ++) {
			if (N % i == 0) {
				int j = N / i;
				
				if (min > j - i) {
					m = j;
					n = i;
					min = m - n;
				}
			}
		}
		
		Arrays.sort(num);
		
		int[][] matrix = new int[m][n];
		int index = N - 1;
		int row = 0, col = 0;
		while (index >= 0) {
			while (index >= 0 && col < n && matrix[row][col] == 0) {
				matrix[row][col] = num[index--];
				col ++;
			}
			row ++; col --;
			
			while (index >= 0 && row < m && matrix[row][col] == 0) {
				matrix[row][col] = num[index--];
				row ++;
			}
			row --; col --;
			
			while (index >= 0 && col >= 0 && matrix[row][col] == 0) {
				matrix[row][col] = num[index--];
				col --;
			}
			row --; col ++;
			
			while (index >= 0 && row >= 0 && matrix[row][col] == 0) {
				matrix[row][col] = num[index--];
				row --;
			}
			row ++; col ++;
		}
		
		for (int i = 0; i < m; i ++) {
			System.out.print(matrix[i][0]);
			for (int j = 1; j < n; j ++) {
				System.out.print(" " + matrix[i][j]);
			}

			System.out.printf("\n");
		}
		
		
	}

}
