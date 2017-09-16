package Basic;
import java.util.Scanner;

public class test1007 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int cnt = 0; int tmp = 2;
		if (N == 1 || N == 2) {
			cnt = 0;
		}
		else {
			for (int i = 3; i <= N; i ++) {
				if (isPrime(i)) {
					if (i - tmp == 2) {
						cnt += 1;
					}
					tmp = i;
				}
			}
		}
		System.out.println(cnt);
		in.close();
	}
	
	public static boolean isPrime(int x) {
		boolean flag = true;
		if (x < 2) {
			flag = false;
		}
		else {
			for (int i = 2; i <= Math.sqrt(x); i ++) {
				if (x % i == 0) {
					flag =  false;
					break;
				}
			}
		}
		return flag;
	}

}
