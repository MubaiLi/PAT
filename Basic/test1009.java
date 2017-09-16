package Basic;
import java.util.Scanner;

public class test1009 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String Sentence = in.nextLine();
		String[] str = Sentence.split(" ");
		int n = str.length;
		for (int i = 0; i < n; i ++) {
			System.out.print(str[n - i - 1]);
			if (i != n - 1) {
				System.out.print(" ");
			}
		}
		in.close();
	}

}
