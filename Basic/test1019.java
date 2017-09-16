package Basic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class test1019 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N_str = br.readLine();
		int N = Integer.parseInt(N_str);
		int[] num = splitNum(N);
		int m; int n;
		while (true) {
			if (num[0] == num[1] && num[0] == num[2] && num[0] == num[3]) {
				System.out.printf("%04d - %04d = %04d\n", N, N, 0);
				break;
			}
			m = numDown(N); n = numUp(N);
			N = m - n;
			if (N == 6174) {
				System.out.printf("%04d - %04d = %04d\n", m, n, N);
				break;
			}
			System.out.printf("%04d - %04d = %04d\n", m, n, N);
		}	
	}
	
	public static int[] splitNum(int n) {
		int[] num = new int[4];
		num[0] = n / 1000;
		num[1] = (n - num[0] * 1000) / 100;
		num[2] = (n - num[0] * 1000 - num[1] * 100) / 10;
		num[3] = n- num[0] * 1000 - num[1] * 100 - num[2] * 10;
		return num;
	}
	
	public static int numDown(int n) {
		int[] numDown = splitNum(n);
		Arrays.sort(numDown);
		int nDown = numDown[3] * 1000 + numDown[2] * 100 + numDown[1] * 10 + numDown[0];
		return nDown;
	}
	
	public static int numUp(int n) {
		int[] numUp = splitNum(n);
		Arrays.sort(numUp);
		int nUp = numUp[0] * 1000 + numUp[1] * 100 + numUp[2] * 10 + numUp[3];
		return nUp;
	}
	
}
