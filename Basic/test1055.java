package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class test1055 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] N_str = (br.readLine()).split(" ");
		int N = Integer.parseInt(N_str[0]);
		int K = Integer.parseInt(N_str[1]);
		int M = N / K;
		int M_last = M + N % K;
		
		Student1055[] stu = new Student1055[N];
		for (int i = 0; i < N; i ++) {
			String[] str = (br.readLine()).split(" ");
			stu[i] = new Student1055(str[0], Integer.parseInt(str[1]));
		}
		
		Arrays.sort(stu);
		
		int row = K; int m, mid; int index = 0;
		while(row != 0) {
			if (row == K) {
				m = M_last;
			} else {
				m = M;
			}
			mid = m / 2;
			String[] str = new String[m];
			str[mid] = stu[index].name;
			int left = mid - 1;
			for (int i = index + 1; i < index + m; i += 2) {
				str[left --] = stu[i].name;
			}
			int right = mid + 1;
			for (int i = index + 2; i < index + m; i += 2) {
				str[right ++] = stu[i].name;
			}
			System.out.print(str[0]);
			for (int i = 1; i < m; i ++) {
				System.out.print(" " + str[i]);
			}
			System.out.printf("\n");
			index += m;
			row --;
		}
		
	}

}

class Student1055 implements Comparable<Student1055> {
	String name;
	int height;
	
	public Student1055() {
		this("", 0);
	}
	
	public Student1055(String aName, int aHeight) {
		name = aName;
		height = aHeight;
	}

	@Override
	public int compareTo(Student1055 o) {
		if (this.height < o.height) {
			return 1;
		} else if (this.height > o.height) {
			return -1;
		} else {
			return this.name.compareTo(o.name);
		}
	}
}