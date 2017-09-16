package Basic;
import java.util.Scanner;

public class test1006 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if (n < 10) {
			unit(n);
		}
		else if (n < 100) {
			int a = n / 10; int b = n - 10 * a; 
			ten(a);
			unit(b);
		}
		else {
			int a = n / 100; int b = (n - 100 * a) / 10; int c = n - 100 * a - 10 * b;
			hundred(a);
			ten(b);
			unit(c);
		}
		in.close();
	}
	public static void unit(int x) {
		for (int i = 1; i <= x; i ++) {
			System.out.print(i);
		}
	}
	public static void ten(int x) {
		for (int i = 1; i <= x; i ++) {
			System.out.print("S");
		}
	}
	public static void hundred(int x) {
		for (int i = 1; i <= x; i ++) {
			System.out.print("B");
		}
	}
}