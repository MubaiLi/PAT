package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1023 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = (br.readLine()).split(" ");
		int[] num = new int[10];
		int index = 0;
		for (int i = 0; i < 10; i ++) {
			num[i] = Integer.parseInt(str[i]);
		}
		
		for (int i = 1; i < 10; i ++) {
			if (num[i] != 0) {
				index = i; 
				System.out.print(i);
				break;
			}
		}
		if (num[0] != 0) {
			for (int i = 0; i < num[0]; i ++) {
				System.out.print(0);
			}
			printNum(num, index);
		} else {
			printNum(num, index);
		}	
	}
	
	public static void printNum(int[] num, int index) {
		if (num[index] > 1) {
			for (int j = 1; j < num[index]; j ++) {
				System.out.print(index);
			}
		}
		for (int i = index + 1; i < 10; i ++) {
			for (int j = 0; j < num[i]; j ++) {
				System.out.print(i);
			}
		}
	}
}
