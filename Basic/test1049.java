package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1049 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N_str = br.readLine();
		int N = Integer.parseInt(N_str);
		String[] str = (br.readLine()).split(" ");
		double sum = 0.0;
		for (int i = 0; i < N; i ++) {
			double n = Double.parseDouble(str[i]);
			sum += n * (N - i) * (i + 1);
		}
		
		System.out.printf("%.2f", sum);
	}

}
