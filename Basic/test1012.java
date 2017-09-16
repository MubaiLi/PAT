package Basic;
import java.util.Scanner;

public class test1012 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		boolean flag0 = false; boolean flag1 = false; boolean flag2 = false; boolean flag3 = false; boolean flag4 = false;
		int sum0 = 0; int sum1 = 0; double sum3 = 0.0;
		int cnt1 = 0; int cnt2 = 0; int cnt3 = 0;
		int max = 0;
		for (int i = 0; i < N; i ++) {
			int x = in.nextInt();
			int remainder = x % 5;
			switch (remainder) {
				default:
					break;
				case 0 :
					if (x % 2 == 0) {
						sum0 += x;
						flag0 = true;
					}
					break;
				case 1 :
					cnt1 += 1;
					sum1 += Math.pow(-1, cnt1 + 1) * x;
					flag1 = true;
					break;
				case 2 :
					cnt2 += 1;
					flag2 = true;
					break;
				case 3 :
					sum3 += x;
					cnt3 += 1;
					flag3 = true;
					break;
				case 4 :
					max = x > max ? x : max;
					flag4 = true;
					break;
			}
		}
		if (flag0) {
			System.out.print(sum0 + " ");
		} else {
			System.out.print("N ");
		}
		if (flag1) {
			System.out.print(sum1 + " ");
		} else {
			System.out.print("N ");
		}
		if (flag2) {
			System.out.print(cnt2 + " ");
		} else {
			System.out.print("N ");
		}
		if (flag3) {
			System.out.printf("%.1f ", sum3 / cnt3);
		} else {
			System.out.print("N ");
		}
		if (flag4) {
			System.out.print(max);
		} else {
			System.out.print("N");
		}
		in.close();
	}
}
