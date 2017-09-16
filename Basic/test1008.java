package Basic;
import java.util.Scanner;

public class test1008 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		int[] num = new int[N];
		int[] numM = new int[N];
		int m = M % N;
		for (int i = 0; i < N; i ++) {
			num[i] = in.nextInt();
		}
		for (int i = 0; i < N; i ++) {
			int p = (i + m) % N;
			numM[p] = num[i];
		}
		for (int i = 0; i < N; i ++) {
			System.out.print(numM[i]);
			if (i != N - 1) {
				System.out.print(" ");
			}
		}
		in.close();
	}

}
