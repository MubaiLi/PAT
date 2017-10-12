package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class test1052 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> hands = parse(br.readLine());
		List<String> eyes = parse(br.readLine());
		List<String> mouth = parse(br.readLine());
		
		String N_str = br.readLine();
		int N = Integer.parseInt(N_str);
		int[] hl = new int[N];
		int[] el = new int[N];
		int[] m = new int[N];
		int[] er = new int[N];
		int[] hr = new int[N];
		for (int i = 0; i < N; i ++) {
			String[] str = (br.readLine()).split(" ");
			hl[i] = Integer.parseInt(str[0]) - 1;
			el[i] = Integer.parseInt(str[1]) - 1;
			m[i] = Integer.parseInt(str[2]) - 1;
			er[i] = Integer.parseInt(str[3]) - 1;
			hr[i] = Integer.parseInt(str[4]) - 1;
		}
		
		for(int i = 0; i < N; i ++) {
			if (hl[i] >= hands.size() || hr[i] >= hands.size() || el[i] >= eyes.size() || er[i] >= eyes.size() || m[i] >= mouth.size()) {
				System.out.println("Are you kidding me? @\\/@");
				continue;
			}
			if (hl[i] < 0 || el[i] < 0 || m[i] < 0 || er[i] < 0 || hr[i] < 0) {
				System.out.println("Are you kidding me? @\\/@");
				continue;
			}
			System.out.println(hands.get(hl[i]) + "(" + eyes.get(el[i]) + mouth.get(m[i])
			+ eyes.get(er[i]) + ")" + hands.get(hr[i]));
		}
		
		
	}
	
	public static List<String> parse(String str) {
		List<String> list = new ArrayList<>();
		for (int i = 0; i < str.length(); i ++) {
			if (str.charAt(i) == '[') {
				for (int j = i; j < str.length(); j ++) {
					if (str.charAt(j) == ']') {
						list.add(str.substring(i + 1, j));
						break;
					}
				}
			}
		}
		return list;
	}

}
