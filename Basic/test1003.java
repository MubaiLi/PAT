package Basic;
import java.util.*;

public class test1003 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int num = Integer.parseInt(in.nextLine().trim());
		String[] str = new String[num];
        for (int i = 0; i < num; i ++) {
        	str[i] = in.nextLine();
        }
        for (int j = 0; j < num ; j ++){
        	if (isAnswer(str[j])) {
        		System.out.println("YES");
        	}
        	else {
        		System.out.println("NO");
        	}
        	
        }
        in.close();
	}
	
	public static boolean isAnswer(String s) {
		int cntP = 0; int cntA = 0; int cntT = 0;
		boolean flag = false;
		for (int i = 0; i < s.length(); i ++) {
			char ch = s.charAt(i);
			if (ch == 'P') {
				cntP += 1;
			}
			else if (ch == 'A') {
				cntA += 1;
			}
			else if (ch == 'T') {
				cntT += 1;
			}
			else {
				flag =  false; 
				break;
			}
		}
		if (cntA >= 1 && cntP == 1 && cntT == 1) {
			if (s.indexOf('P') * (s.indexOf('T') - s.indexOf('P') - 1) == 
					s.length() - s.indexOf('T') - 1) {
				flag = true;
			}
			else {
				flag = false;
			}
		}
		return flag;
	}

}
