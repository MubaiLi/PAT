package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1064 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N_str = br.readLine();
		int N = Integer.parseInt(N_str);
		int[] num = new int[N];
		int[] id = new int[37];
		String[] str = (br.readLine()).split(" ");
		for (int i = 0; i < N; i ++) {
			num[i] = getId(Integer.parseInt(str[i]));
			id[num[i]] ++;
		}
		int cnt = 0;
		for (int i = 0; i < 37; i ++) {
			if (id[i] != 0) {
				cnt ++;
			}
		}
		System.out.println(cnt);
		boolean isFirst = true;
		for (int i = 1; i < 37; i ++) {
			if (id[i] != 0) {
				if (isFirst) {
					System.out.print(i);
					isFirst = false;
				} else {
					System.out.print(" " + i);
				}
			}
		}
		
	}
	
	public static int getId(int n) {
		int a = n / 1000;
		int b = (n - 1000 * a) / 100;
		int c = (n - 1000 * a - 100 * b) / 10;
		int d = n - 1000 * a - 100 * b - 10 * c;
		return a + b + c + d;
	}

}
