package Basic;
import java.io.*;


public class test1021 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char[] N = str.toCharArray();
		int k = N.length;
		int[] num = new int[10];

		for (int i = 0; i < k; i ++) {

			switch (N[i]) {
				case '0':
					num[0] ++; break;
				case '1':
					num[1] ++; break;
				case '2':
					num[2] ++; break;
				case '3':
					num[3] ++; break;
				case '4':
					num[4] ++; break;
				case '5':
					num[5] ++; break;
				case '6':
					num[6] ++; break;
				case '7':
					num[7] ++; break;
				case '8':
					num[8] ++; break;
				case '9':
					num[9] ++; break;
				default: 
					System.out.println("default"); break;
			}
		}
		
		for (int i = 0; i < 10; i ++) {
			if (num[i] != 0) {
				System.out.printf("%01d:%01d\n", i, num[i]);
			}
		}
	}
}