package Basic;
import java.io.*;

public class test1002 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int sum = 0;
			String str = br.readLine();
			char[] numStr = str.toCharArray();
			for (int i = 0; i < numStr.length; i ++) {
				sum += numStr[i] - '0';
			}
			print(sum);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void print(int n) {
		int a; int b; int c;
		String[] py = {"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};
		if (n < 10) {
			System.out.println(py[n]);
		}
		else if (n < 100) {
			a = n / 10;
			b = n - a *10;
			System.out.println(py[a] + " " + py[b]);
		}
		else {
			a = n / 100;
			b = (n - a * 100) / 10;
			c = n - a * 100 - b * 10;
			System.out.println(py[a] + " " + py[b] + " " + py[c]);
		}
		
	}
}

