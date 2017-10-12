package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class test1060 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N_str = br.readLine();
		int N = Integer.parseInt(N_str);
		int[] distance = new int[N];
		String[] str = (br.readLine()).split(" ");
		for (int i = 0; i < N; i ++) {
			distance[i] = Integer.parseInt(str[i]);
		}
		
		Arrays.sort(distance);
		
		for (int i = 0; i < N; i ++) {
			if (distance[i] > (N - i)) {
				System.out.print(N - i); break;
			}
		}
		
//		int num = N;
//		while (num != 0) {
//			int cnt = 0;
//			for (int i = 0; i < N; i ++) {
//				if (distance[i] > num) {
//					cnt ++;
//				}
//			}
//			if (cnt == num) {
//				System.out.print(num); break;
//			}
//			num --;
//		}
	}

}
