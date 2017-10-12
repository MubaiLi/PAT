package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1059 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N_str = br.readLine();
		int N = Integer.parseInt(N_str);
		String[] id = new String[N];
		for (int i = 0; i < N; i ++) {
			id[i] = br.readLine();
		}
		String K_str = br.readLine();
		int K = Integer.parseInt(K_str);
		String[] search = new String[K];
		for (int i = 0; i < K; i ++) {
			search[i] = br.readLine();
		}
		for (int i = 0; i < K; i ++) {
			int index = 0;
			boolean isExist = false; boolean isChecked = false;
			for (int j = 0; j < N; j ++) {
				if (search[i].equals(id[j])) {
					isExist = true;
					index = j;
					break;
				}
			}
			if (isExist) {
				for (int j = 0; j < i; j ++) {
					if (search[i].equals(search[j])) {
						isChecked = true;
					}
				}
			}
			
			if (!isExist) {
				System.out.println(search[i] + ": Are you kidding?");
			} else if (isChecked) {
				System.out.println(search[i] + ": Checked");
			} else if (index == 0){
				System.out.println(search[i] + ": Mystery Award");
			} else if (isPrime(index + 1)) {
				System.out.println(search[i] + ": Minion");
			} else {
				System.out.println(search[i] + ": Chocolate");
			}
		}
		
		
	}
	
	public static boolean isPrime(int n) {
		for (int i = 2; i <= Math.sqrt(n); i ++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
