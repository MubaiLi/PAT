package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class test1035 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N_str = br.readLine();
		int N = Integer.parseInt(N_str);
		String[] num_str = (br.readLine()).split(" ");
		String[] mid_str = (br.readLine()).split(" ");
		int[] num = new int[N];
		int[] mid = new int[N];
		for (int i = 0; i < N; i ++) {
			num[i] = Integer.parseInt(num_str[i]);
			mid[i] = Integer.parseInt(mid_str[i]);
		}
		
		boolean isInsert = true;
		int index = 0;
		for (int i = 0; i < N; i ++) {
			if (mid[i] > mid[i + 1]) {
				index = i; break;
			}
		}
		for (int i = index + 1; i < N; i ++) {
			if (mid[i] != num[i]) {
				isInsert = false; break;
			}
		}
		
		if (isInsert) {
			System.out.println("Insertion Sort");
			Arrays.sort(mid, 0, index + 2);
			print(mid);
		} else {
			System.out.println("Merge Sort");
			boolean flag = true;
			int k = 1;
			while (flag) {
				flag = false;
				if (!isEqual(num, mid)) {
					flag = true;
				}
				k = k * 2;
				for (int i = 0; i < N / k; i ++) {
					Arrays.sort(num, k * i, k * (i + 1));
				}
			}
			print(num);
		}
	}
	
	public static boolean isEqual(int[] a, int[] b) {
		for (int i = 0; i < a.length; i ++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}
	
	public static void print(int[] n) {
		for (int i = 0; i < n.length - 1; i ++) {
			System.out.printf("%d ", n[i]);
		}
		System.out.printf("%d", n[n.length - 1]);
	}
}
