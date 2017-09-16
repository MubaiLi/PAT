package Basic;

//import java.util.Arrays;
import java.util.Scanner;

class Student {
	String name;
	String stu_id;
	int score;
	public Student() {
		this(" ", " ", 0);
	}
	public Student(String initName, String initId, int initScore) {
		name = initName;
		stu_id = initId;
		score = initScore;
	}
}

public class test1004 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine().trim());
		Student stu = new Student();
		Student max = new Student();
		Student min = new Student(" ", " ", 100);
		for (int i = 0; i < n; i ++) {
			stu.name = in.next();
			stu.stu_id = in.next();
			stu.score = in.nextInt();
			if (max.score < stu.score) {
				max.name = stu.name;
				max.stu_id = stu.stu_id;
				max.score = stu.score;
			}
			if (min.score > stu.score) {
				min.name = stu.name;
				min.stu_id = stu.stu_id;
				min.score = stu.score;
			}
		}
		System.out.println(max.name + " " + max.stu_id);
		System.out.println(min.name + " " + min.stu_id);
		in.close();
	}
}


/*public class test1004 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int num = Integer.parseInt(in.nextLine().trim());
		String[] str = new String[num];
		for (int i = 0; i < num; i ++) {
        	str[i] = in.nextLine();
        }
		String[][] info = new String[num][3];
		for (int i = 0; i < num; i ++) {
			String[] tmpStr = str[i].split("\\s+");
			for (int j = 0; j < 3; j ++) {
				info[i][j] = tmpStr[j];
			}
		}
		int[] Score = new int[num];
		for (int i = 0; i < num; i ++) {
			Score[i] = Integer.parseInt(info[i][2]);
		}
		System.out.println(info[max(Score)][0] + " " + info[max(Score)][1]);
		System.out.println(info[min(Score)][0] + " " + info[min(Score)][1]);

	}
	
	public static int max(int[] x) {
		int n_max = 0; int index_max = 0;
		for (int i = 0; i < x.length; i ++) {
			int tmp = x[i];
			if (tmp > n_max) {
				n_max = tmp;
				index_max = i;
			}
		}
		return index_max;
	}
	
	public static int min(int[] x) {
		int n_min = 0; int index_min = 0;
		for (int i = 0; i < x.length; i ++) {
			int tmp = x[i];
			if (tmp < n_min) {
				n_min = tmp;
				index_min = i;
			}
		}
		return index_min;
	}

}*/
