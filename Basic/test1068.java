package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class test1068 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] N_str = br.readLine().split(" ");
		int M = Integer.parseInt(N_str[0]);
		int N = Integer.parseInt(N_str[1]);
		int TOL = Integer.parseInt(N_str[2]);
		int[][] pixel = new int[N][M];
		Map<Integer, Integer> uniq = new HashMap<>();
		for (int i = 0; i < N; i ++) {
			String[] str = br.readLine().split("\\s+");
			for (int j = 0; j < M; j ++) {
				pixel[i][j] = Integer.parseInt(str[j]);
				if (uniq.containsKey(pixel[i][j])) {  
                    uniq.remove(pixel[i][j]);  
                } else {   
                    uniq.put(pixel[i][j], 1);  
                }
			}
		}	
		
		int x = 0, y = 0;
		int cnt = 0;
		boolean isUnique = true;
		
		outer:for (int i = 1; i < N - 1; i ++) {
			for (int j = 1; j < M - 1; j ++) {
				if ((Math.abs(pixel[i][j] - pixel[i - 1][j - 1])) > TOL
						&& (Math.abs(pixel[i][j] - pixel[i][j - 1])) > TOL
						&& (Math.abs(pixel[i][j] - pixel[i + 1][j - 1])) > TOL
						&& (Math.abs(pixel[i][j] - pixel[i - 1][j])) > TOL
						&& (Math.abs(pixel[i][j] - pixel[i + 1][j])) > TOL
						&& (Math.abs(pixel[i][j] - pixel[i - 1][j + 1])) > TOL
						&& (Math.abs(pixel[i][j] - pixel[i][j + 1])) > TOL
						&& (Math.abs(pixel[i][j] - pixel[i + 1][j + 1])) > TOL
						&& uniq.containsKey(pixel[i][j])) {
					if (cnt == 0) {
						x = j; y = i;
						cnt ++;
					} else if (cnt > 0) {
						System.out.print("Not Unique"); 
						isUnique = false;
						break outer;
					}
					}
			}
		}
		
		if (cnt == 0) {
			System.out.print("Not Exist");
		} else if (isUnique) {
			System.out.printf("(%d, %d): %d", x + 1, y + 1, pixel[y][x]);
		}

	}

}
