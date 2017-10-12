package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class test1069 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] N_str = br.readLine().split(" ");
		int M = Integer.parseInt(N_str[0]);
		int N = Integer.parseInt(N_str[1]);
		int S = Integer.parseInt(N_str[2]);
		String[] name = new String[M];
		for (int i = 0; i < M; i ++) {
			name[i] = br.readLine();
		}
		List<String> list = new ArrayList<String>();
		
		if (S > M) {
			System.out.print("Keep going...");
		} else {
			int i = S - 1;
			while (i < M) {
				if (!list.contains(name[i])) {
					list.add(name[i]);
					i += N;
				} else {
					i ++;
				}
			}
			for (String str : list) {
				System.out.println(str);
			}
		}
		
		
		
	}

}
