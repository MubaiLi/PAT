package Basic;
import java.util.Arrays;
import java.util.Scanner;

public class test1020 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int D = in.nextInt();
		double prices = 0.0;
		
		MoonCake[] mc = new MoonCake[N];
		for (int i = 0; i < N; i ++) {
			mc[i] = new MoonCake();
			mc[i].inventory = in.nextDouble();
		}
		for (int i = 0; i < N; i ++) {
			mc[i].totalPrice = in.nextDouble();
			mc[i].singlePrice = mc[i].totalPrice / mc[i].inventory;
		}
		in.close();
		
		Arrays.sort(mc);
		
		for (int i = 0; i < N; i ++) {
			if (mc[i].inventory < D) {
				prices += mc[i].totalPrice;
				D -= mc[i].inventory;
			} else if (D > 0) {
				prices += D * mc[i].singlePrice;
				D = 0;
				break;
			}
		}
		
		System.out.printf("%.2f", prices);
	}
}
		
	
class MoonCake implements Comparable<MoonCake> {
	double inventory;
	double totalPrice;
	double singlePrice;
		
	public MoonCake() {
		this(0, 0, 0);
	}
	public MoonCake(int initInv, int initTotal, int initSingle) {
		inventory = initInv;
		totalPrice = initTotal;
		singlePrice = initSingle;
	}
	@Override
	public int compareTo(MoonCake o) {
		if (this.singlePrice > o.singlePrice) {
			return -1;
		} else if (this.singlePrice < o.singlePrice) {
			return 1;
		} else {
			return 0;
		}
	}
}
