package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1034 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = (br.readLine()).split(" ");
		String[] str1 = str[0].split("/");
		String[] str2 = str[1].split("/");
		int a1 = Integer.parseInt(str1[0]);
		int b1 = Integer.parseInt(str1[1]);
		int a2 = Integer.parseInt(str2[0]);
		int b2 = Integer.parseInt(str2[1]);
		add(a1, b1, a2, b2);
		minus(a1, b1, a2, b2);
		multiply(a1, b1, a2, b2);
		divide(a1, b1, a2, b2);		
	}

	public static void printSimple(int a, int b) {
		boolean isNegative = false;
		if (a < 0) {
			isNegative = true;
			a = a * (-1);
		}
		int gcd = getGcd(a, b);
		a = a / gcd;
		b = b / gcd;
		int k = a / b;
		int x = a % b;
		int y = b;
		if (isNegative) {
			System.out.print("(-");
			if (k == 0) {
				if (x != 0) {
					System.out.print(x + "/" + y);
				} else {
					System.out.print(0);
				}
			} else {
				System.out.print(k);
				if (x != 0) {
					System.out.print(" " + x + "/" + y);
				}
			}
			System.out.print(")");
		} else if (k == 0) {
			if (x != 0) {
				System.out.print(x + "/" + y);
			} else {
				System.out.print(0);
			}
		} else {
			System.out.print(k);
			if (x != 0) {
				System.out.print(" " + x + "/" + y);
			}
		}
	}
	
	public static int getGcd(int x, int y) {
		if (y == 0) {
			return x;
		} else {
			return getGcd(y, x%y);
		}
	}
	
	public static void add(int a1, int b1, int a2, int b2) {
		int x = a1 * b2 + a2 *b1;
		int y = b1 * b2;
		printSimple(a1, b1);
		System.out.print(" + ");
		printSimple(a2, b2);
		System.out.print(" = ");
		printSimple(x, y);
		System.out.print("\n");
	}
	
	public static void minus(int a1, int b1, int a2, int b2) {
		int x = a1 * b2 - a2 *b1;
		int y = b1 * b2;
		printSimple(a1, b1);
		System.out.print(" - ");
		printSimple(a2, b2);
		System.out.print(" = ");
		printSimple(x, y);
		System.out.print("\n");
	}
	
	public static void multiply(int a1, int b1, int a2, int b2) {
		int x = a1 * a2;
		int y = b1 * b2;
		printSimple(a1, b1);
		System.out.print(" * ");
		printSimple(a2, b2);
		System.out.print(" = ");
		printSimple(x, y);
		System.out.print("\n");
	}
	
	public static void divide(int a1, int b1, int a2, int b2) {
		int x = a1 * b2;
		int y = b1 * a2;
		if (y < 0) {
			x = (-1) * x;
			y = (-1) * y;
		}
		printSimple(a1, b1);
		System.out.print(" / ");
		printSimple(a2, b2);
		System.out.print(" = ");
		if (y == 0) {
			System.out.print("Inf");
		} else {
			printSimple(x, y);
		}
		System.out.print("\n");
	}

}
