package Basic;
import java.io.*;

public class test1018 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N_str = br.readLine();
		int N = Integer.parseInt(N_str);
		
		int draw = 0; int winA = 0; int loseA = 0;
		char[] ch = {'B', 'C', 'J'};
		int[] stateA = new int[3];
		int[] stateB = new int[3];
		
		for (int i = 0; i < N; i ++) {
			String[] str = (br.readLine()).split(" ");
			char A = str[0].charAt(0);
			char B = str[1].charAt(0);
			if (A == B) {
				draw += 1;
			} else {
				if (A == 'B') {
					if (B == 'C') {
						winA += 1;
						stateA[0] += 1;
					} else if (B == 'J') {
						loseA += 1;
						stateB[2] += 1;
					}
				} else if (A == 'C') {
					if (B == 'J') {
						winA += 1;
						stateA[1] += 1;
					} else if (B == 'B') {
						loseA += 1;
						stateB[0] += 1;
					}
				} else if (A == 'J') {
					if (B == 'B') {
						winA += 1;
						stateA[2] += 1;
					} else if (B == 'C') {
						loseA += 1;
						stateB[1] += 1;
					}
				}
			}
		}

		System.out.println(winA + " " + draw + " " + loseA);
		System.out.println(loseA + " " + draw + " " + winA);
		System.out.println(ch[findIndex(stateA)] + " " + ch[findIndex(stateB)]);
	}
	
	public static int findIndex(int[] n) {
		int index = 0;
		int m = n[0];
		for (int i = 0; i < n.length; i ++) {
			if (n[i] > m) {
				m = n[i];
				index = i;
			}
		}
		return index;
	}
	
}
