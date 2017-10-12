package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test1065 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] cp1 = new int[N];
		int[] cp2 = new int[N];
		for (int i = 0; i < N; i ++) {
			String[] cp_str = br.readLine().split(" ");
			cp1[i] = Integer.parseInt(cp_str[0]);
			cp2[i] = Integer.parseInt(cp_str[1]);
		}
		int M = Integer.parseInt(br.readLine());
		int[] party = new int[M];
		String[] str = br.readLine().split(" ");
		for (int i = 0; i < M; i ++) {
			party[i] = Integer.parseInt(str[i]);
		}
		List<Integer> single = new ArrayList<Integer>();
		for (int i = 0; i < M; i ++) {
			boolean hasCp = false;
			boolean cpIsHere = false;
			for (int j = 0; j < N; j ++) {
				if (party[i] == cp1[j]) {
					hasCp = true;
					for (int k = 0; k < M; k ++) {
						if (cp2[j] == party[k]) {
							cpIsHere = true;
						}
					}
				} else if (party[i] == cp2[j]) {
					hasCp = true;
					for (int k = 0; k < M; k ++) {
						if (cp1[j] == party[k]) {
							cpIsHere = true;
						}
					}
				}
			}
			if (!hasCp) {
				single.add(party[i]);
			} else if (!cpIsHere) {
				single.add(party[i]);
			}
		}
		
		Collections.sort(single);
		
		System.out.println(single.size());
		boolean isFirst = true;
		for (int i = 0; i < single.size(); i ++) {
			if (isFirst) {
				System.out.print(single.get(i));
				isFirst = false;
			} else {
				System.out.print(" " + single.get(i));
			}
		}
		
	}

}
