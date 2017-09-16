package Basic;
import java.io.*;

public class test1013 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] in = br.readLine().split(" ");
		int M = Integer.parseInt(in[0]);
		int N = Integer.parseInt(in[1]);

		int cnt = 0;
		for (int i = 2; ; i ++) {
			if (isPrime(i)) {
				cnt ++;
				if (cnt >= M && cnt <= N) {
					if ((cnt - M + 1) % 10 == 0 || cnt == N) {
						System.out.println(i);
					} else {
						System.out.print(i + " ");
					}
				}
				if (cnt == N) {
					break;
				}
			}
		}
		
	}
	
	public static boolean isPrime(int x) {
		boolean flag = true;
		if (x < 2) {
			flag = false;
		} else {
			for (int i = 2; i <= Math.sqrt(x); i ++) {
				if (x % i == 0) {
					flag = false; break;
				}
			}
		}
		return flag;
	}

}
