package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class test1054 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N_str = br.readLine();
		int N = Integer.parseInt(N_str);
		String[] str = (br.readLine()).split(" ");
		int cnt = 0;
		double sum = 0.0;
		for (int i = 0; i < N; i ++) {
			double n;
			try {
				n = Double.parseDouble(str[i]);
				double tmp = Double.parseDouble(String.format("%.2f", n));  
				if (n < -1000 || n > 1000 || Math.abs(n - tmp) != 0) {
					throw new NumberFormatException();
				}
				cnt ++;
				sum += n;
			} catch (NumberFormatException e) {
				System.out.println("ERROR: " + str[i] + " is not a legal number");
			}
		}
		
		if (cnt == 0) {
			System.out.println("The average of 0 numbers is Undefined");
		} else if (cnt == 1) {
			System.out.printf("The average of 1 number is %.2f", sum);
		} else {
			System.out.printf("The average of %d numbers is %.2f", cnt, sum / cnt);
		}
	}

}
