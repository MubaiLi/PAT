package Basic;
import java.io.*;


public class test1022 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = (br.readLine()).split(" ");
		
		long A = Long.parseLong(str[0]);
		long B = Long.parseLong(str[1]);
		int D = Integer.parseInt(str[2]);
		
		sumtoD(A, B, D);		
	}
	
	public static void sumtoD(long a, long b, int d) {
		long s = a + b;
		int[] ans = new int[31];
        int num = 0;
		
        do {
        	ans[num] = (int) (s % d);
        	num ++;
        	s /= d;
        } while (s != 0);
        
        for (int i = num - 1; i >= 0; i --) {
        	System.out.print(ans[i]);
        }
	}
}