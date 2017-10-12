package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1067 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] N_str = br.readLine().split(" ");
		String password = N_str[0];
		int N = Integer.parseInt(N_str[1]);
		int cnt = 0;
		while (true) {
			String str = br.readLine();
			if (str.equals("#")) {
				break;
			}
			cnt ++;
			if (cnt <= N) {
				if (str.equals(password)) {
					System.out.print("Welcome in"); break;
				} else {
					System.out.println("Wrong password: " + str);
					if (cnt == N) {
						System.out.println("Account locked"); break;
					}
				}
			}
			
		}
		
	}

}
