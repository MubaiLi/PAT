package Basic;
import java.util.Scanner;

public class test1011 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		boolean[] bl = new boolean[T];
		for (int i = 0; i < T ; i ++) {
			long a = in.nextLong();
			long b = in.nextLong();
			long c = in.nextLong();
			bl[i] = isBigger(a, b, c);
		}
		for (int i = 0; i < T; i ++) {
			System.out.println("Case #" + (i + 1) + ": " + bl[i]);
		}
		in.close();
	}
	
	public static boolean isBigger(long a, long b, long c) {
		boolean flag = (a + b) > c ? true : false;
		return flag;
	}

}
