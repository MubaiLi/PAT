package Basic;
import java.util.Scanner;

public class test1010 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean flag = false;
		while (in.hasNext()) {
			int coeff = in.nextInt();
			int expo = in.nextInt();
			if (coeff * expo != 0) {
				if (flag) {
					System.out.print(" ");
				}
				else {
					flag = true;
				}
				System.out.print(coeff * expo + " " + (expo - 1));
			}
		}
		in.close();
		if (!flag) {
			System.out.print("0 0");
		}
	}

}
