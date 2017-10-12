package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1058 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] N_str = (br.readLine()).split(" ");
		int N = Integer.parseInt(N_str[0]);
		int M = Integer.parseInt(N_str[1]);
		
		Subject[] sub = new Subject[M];
		for (int i = 0; i < M; i ++) {
			String[] str = (br.readLine()).split(" ");
			int fullS = Integer.parseInt(str[0]);
			int numOp = Integer.parseInt(str[1]);
			int numCo = Integer.parseInt(str[2]);
			char[] ch = new char[numCo];
			for (int j = 0; j < numCo; j ++) {
				ch[j] = str[j + 3].charAt(0);
			}
			sub[i] = new Subject(fullS, numOp, numCo, ch);		
		}
		
		boolean isWrong  = false;
		int[] score = new int[N];
		for (int i = 0; i < N; i ++) {
			String[] s = parse(br.readLine(), M);
			
			for (int j = 0; j < M; j ++) {
				isWrong  = false;
				String[] each = s[j].split(" ");
				int num = Integer.parseInt(each[0]);
				if (num != sub[j].numCorrect) {
					isWrong = true;
					sub[j].setNumWrong(1);
//					System.out.println("wrong number");
				} else {
					for (int k = 0; k < num; k ++) {
						if (each[k + 1].charAt(0) != sub[j].correctOp[k]) {
							isWrong = true;
							sub[j].setNumWrong(1);
//							System.out.println("wrong letter");
							break;
						}
					}
				}
				if (!isWrong) {
//					System.out.println(j + " " + score[i] + " " + sub[j].fullScore);
					score[i] += sub[j].fullScore;
				}
			}
		}
		
		for (int i = 0; i < N; i ++) {
			System.out.println(score[i]);
		}
		
		int max = 0;
		for (int i = 0; i < M; i ++) {
			if (sub[i].numWrong > max) {
				max = sub[i].numWrong;
			}
		}
		if (max == 0) {
			System.out.print("Too simple");
		} else {
			System.out.print(max);
			for (int i = 0; i < M; i ++) {
				if (sub[i].numWrong == max) {
					System.out.print(" " + (i + 1));
				}
			}
		}
		
		
	}
	
	public static String[] parse(String str, int N) {
		String[] s = new String[N];
		int n = 0;
		for (int i = 0; i < str.length(); i ++) {
			if (str.charAt(i) == '(') {
				for (int j = i; j < str.length(); j ++) {
					if (str.charAt(j) == ')') {
						s[n ++] = str.substring(i + 1, j);
						break;
						}
					}
				}	
			}
		return s;
	}

}

class Subject {
	int fullScore;
	int numOption;
	int numCorrect;
	char[] correctOp = new char[numCorrect];
	int numWrong;
	
	public Subject() {
		this(0, 0, 0, null);
	}
	
	public Subject(int aFullScore, int aNumOption, int aNumCorrect, char[] aCorrectOp) {
		fullScore = aFullScore;
		numOption = aNumOption;
		numCorrect = aNumCorrect;
		correctOp = aCorrectOp;
	}
	
	public int getNumWrong() {
		return numWrong;
	}
	
	public void setNumWrong(int aNumWrong) {
		numWrong += aNumWrong;
	}
}
