package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1073 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] N_str = br.readLine().split(" ");
		int N = Integer.parseInt(N_str[0]);
		int M = Integer.parseInt(N_str[1]);
		Subject1[] sub = new Subject1[M];
		for (int i = 0; i < M; i ++) {
			String[] str = (br.readLine()).split(" ");
			int fullS = Integer.parseInt(str[0]);
			int numOp = Integer.parseInt(str[1]);
			int numCo = Integer.parseInt(str[2]);
			char[] ch = new char[numCo];
			for (int j = 0; j < numCo; j ++) {
				ch[j] = str[j + 3].charAt(0);
			}
			sub[i] = new Subject1(fullS, numOp, numCo, ch);		
		}
		
		boolean isWrong  = false, isHalf = false;
		double[] score = new double[N];
		int[][] numWrong = new int[M][5];
		for (int i = 0; i < N; i ++) {
			String[] s = parse(br.readLine(), M);
			
			for (int j = 0; j < M; j ++) {
				isWrong  = false; isHalf = false;
				String[] each = s[j].split(" ");
				int num = Integer.parseInt(each[0]);
				if (num > sub[j].numCorrect) {
					isWrong = true;
					for (int k = 0; k < num; k ++) {
						if (!isContain2(sub[j].correctOp, each[k + 1].charAt(0))) {
							int m = (int)(each[k + 1].charAt(0) - 'a');
							numWrong[j][m] ++;
						}
					}
					for (int k = 0; k < sub[j].numCorrect; k ++) {
						if (!isContain1(each, sub[j].correctOp[k])) {
							int m = (int)(sub[j].correctOp[k] - 'a');
							numWrong[j][m] ++;
						}
					}
				} else if (num < sub[j].numCorrect) {
					isHalf = true;
					for (int k = 0; k < num; k ++) {
						if (!isContain2(sub[j].correctOp, each[k + 1].charAt(0))) {
							int m = (int)(each[k + 1].charAt(0) - 'a');
							numWrong[j][m] ++;
							isWrong = true; isHalf = false;
						}
					}
					for (int k = 0; k < sub[j].numCorrect; k ++) {
						if (!isContain1(each, sub[j].correctOp[k])) {
							int m = (int)(sub[j].correctOp[k] - 'a');
							numWrong[j][m] ++;
						}
					}
				} else {
					for (int k = 0; k < num; k ++) {
						if (each[k + 1].charAt(0) != sub[j].correctOp[k]) {
							isWrong = true;
							break;
						}
					}
					for (int k = 0; k < num; k ++) {
						if (!isContain2(sub[j].correctOp, each[k + 1].charAt(0))) {
							int m = (int)(each[k + 1].charAt(0) - 'a');
							numWrong[j][m] ++;
							isWrong = true;
						}
					}
					for (int k = 0; k < sub[j].numCorrect; k ++) {
						if (!isContain1(each, sub[j].correctOp[k])) {
							int m = (int)(sub[j].correctOp[k] - 'a');
							numWrong[j][m] ++;
						}
					}
				}
				if (!isWrong) {
					if (isHalf) {
						score[i] += sub[j].fullScore / 2.0;
					} else {
						score[i] += sub[j].fullScore / 1.0;
					}
				}
			}
		}
		
		for (int i = 0; i < N; i ++) {
			System.out.println(score[i]);
		}
		
		int max = 0;
		char[] Op = {'a', 'b', 'c', 'd', 'e'};
		for (int i = 0; i < M; i ++) {
			for (int j = 0; j < 5; j ++) {
				if (numWrong[i][j] > max) {
					max = numWrong[i][j];
				}
			}
		}
		if (max == 0) {
			System.out.print("Too simple");
		} else {
			for (int i = 0; i < M; i ++) {
				for (int j = 0; j < 5; j ++) {
					if (numWrong[i][j] == max) {
						System.out.println(max + " " + (i + 1) + "-" + Op[j]);
					}
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
	
	public static boolean isContain1(String[] arr, char targetValue) {

	    for(String s: arr) {
	        if(s.charAt(0) == targetValue)
	            return true;
	    }
	    return false;
	}
	
	public static boolean isContain2(char[] arr, char targetValue) {

	    for(char s: arr) {
	        if(s == targetValue)
	            return true;
	    }
	    return false;
	}

}

class Subject1 {
	int fullScore;
	int numOption;
	int numCorrect;
	char[] correctOp = new char[numCorrect];
	
	public Subject1() {
		this(0, 0, 0, null);
	}
	
	public Subject1(int aFullScore, int aNumOption, int aNumCorrect, char[] aCorrectOp) {
		fullScore = aFullScore;
		numOption = aNumOption;
		numCorrect = aNumCorrect;
		correctOp = aCorrectOp;
	}

}