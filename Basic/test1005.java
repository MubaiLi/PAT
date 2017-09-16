package Basic;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



class CallatzNum {
	int[] series;
	public CallatzNum() {
		this(null);
	}
	public CallatzNum(int[] initSeries) {
		series = initSeries;
	}
}

public class test1005 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		int[] num = new int[k];
		int[] numT = new int[k];
		ArrayList<Integer> coveredNum = new ArrayList<Integer>();
		ArrayList<Integer> keyNum = new ArrayList<Integer>();
		for (int i = 0; i < k; i ++) {
			num[i] = in.nextInt();
			numT[i] = num[i];
			while (numT[i] != 1) {
				if (numT[i] % 2 == 0) {
					numT[i] /= 2;
					if(!coveredNum.contains(numT[i])) {
						coveredNum.add(numT[i]);
					} else {
						break;
					}
				}
				else {
					numT[i] = (3 * numT[i] + 1) / 2;
					if(!coveredNum.contains(numT[i])) {
						coveredNum.add(numT[i]);
					} else {
						break;
					}
				}
			}
		}
		for (int i = 0; i < k; i ++) {
			if (!coveredNum.contains(num[i])) {
				keyNum.add(num[i]);
			}
		}
		Collections.sort(keyNum, Collections.reverseOrder());
		for (int i = 0; i < keyNum.size(); i ++) {
			System.out.print(keyNum.get(i));
			if (i != keyNum.size() - 1) {
				System.out.print(" ");
			}
		}
		in.close();
	}
}