package Basic;
import java.util.Scanner;

public class test1015 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int L = in.nextInt();
		int H = in.nextInt();
		int n = 0;
		String[] no = new String[N];
		int[] de = new int[N];
		int[] cai = new int[N];
		for (int i = 0; i < N; i ++) {
			no[i] = in.next();
			de[i] = in.nextInt();
			cai[i] = in.nextInt();
		}
		for (int i = 0; i < N; i ++) {
			if (de[i] >= L && cai[i] >= L) {
				n ++;
				
			}
		}

	}

}
