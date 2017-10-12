package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1051 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = (br.readLine()).split(" ");
		double R = Double.parseDouble(str[0]) * Double.parseDouble(str[2]);
		double P = Double.parseDouble(str[1]) + Double.parseDouble(str[3]);
		double A = R * Math.cos(P);
		double B = R * Math.sin(P);
		
		if ((A + 0.005) >= 0 && A < 0) {
			System.out.print("0.00");
		} else {
			System.out.printf("%.2f", A);
		}
		if (B >= 0) {
			System.out.printf("+%.2fi", B);
		} else if (B + 0.005 >= 0 && B < 0) {
			System.out.print("+0.00i");
		} else {
			System.out.printf("%.2fi", B);
		}
		
	}

}
