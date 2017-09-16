package Basic;
import java.util.Scanner;

public class test1001 {

	public static void main(String[] args) {
		int cnt = 0;
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while (n != 1) {
			if (n % 2 == 0) {
				n = n / 2;
				cnt += 1;
			}
			else {
				n = (3 * n + 1) / 2;
				cnt += 1;
			}
		}
		System.out.println(cnt);
		in.close();
	}
}
