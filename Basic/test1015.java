package Basic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test1015 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] N_str = (br.readLine()).split(" ");
		int N = Integer.parseInt(N_str[0]);
		int L = Integer.parseInt(N_str[1]);
		int H = Integer.parseInt(N_str[2]);

		List<Student1015> list1 = new ArrayList<Student1015>();
        List<Student1015> list2 = new ArrayList<Student1015>();
        List<Student1015> list3 = new ArrayList<Student1015>();
        List<Student1015> list4 = new ArrayList<Student1015>();
        
		for (int i = 0; i < N; i ++) {
			String[] str = (br.readLine()).split(" ");
			int no = Integer.parseInt(str[0]);
			int gradeD = Integer.parseInt(str[1]);
			int gradeC = Integer.parseInt(str[2]);
			
			if (gradeD >= L && gradeC >= L) {
				Student1015 stu = new Student1015(no, gradeD, gradeC);
				if (gradeD >= H && gradeC >= H) {
					list1.add(stu);
				} else if (gradeD >= H) {
					list2.add(stu);
				} else if (gradeD >= gradeC) {
					list3.add(stu);
				} else {
					list4.add(stu);
				}
			}	
			}
		
		
		Collections.sort(list1);
		Collections.sort(list2);
		Collections.sort(list3);
		Collections.sort(list4);
		
		System.out.println(list1.size() + list2.size() + list3.size() + list4.size());
		for (Student1015 o : list1) {
			System.out.printf("%d %d %d\n", o.no, o.gradeD, o.gradeC);
		}
		for (Student1015 o : list2) {
			System.out.printf("%d %d %d\n", o.no, o.gradeD, o.gradeC);
		}
		for (Student1015 o : list3) {
			System.out.printf("%d %d %d\n", o.no, o.gradeD, o.gradeC);
		}
		for (Student1015 o : list4) {
			System.out.printf("%d %d %d\n", o.no, o.gradeD, o.gradeC);
		}

	

}
}

class Student1015 implements Comparable<Student1015> {
	int no;
	int gradeD;
	int gradeC;
	int score;
	
	public Student1015() {
		this(10000000, 0, 0);
	}
	public Student1015(int n, int d, int c) {
		no = n;
		gradeD = d;
		gradeC = c;
		this.score = gradeD + gradeC;
	}
	@Override
	public int compareTo(Student1015 o) {
		if (this.score < o.score) {
			return 1;
		} else if (this.score > o.score) {
			return -1;
		} else {
			if (this.gradeD < o.gradeD) {
				return 1;
			} else if (this.gradeD > o.gradeD) {
				return -1;
			} else {
				if (this.no > o.no) {
					return 1;
				} else if (this.no < o.no) {
					return -1;
				} else {
					return 0;
				}
			}
		}
	}
}
