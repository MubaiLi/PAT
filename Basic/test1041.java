package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1041 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N_str = br.readLine();
		int N = Integer.parseInt(N_str);
		Student1041[] stu = new Student1041[N];
		for (int i = 0; i < N; i ++) {
			String[] str = (br.readLine()).split(" ");
			stu[i] = new Student1041(str[0], Integer.parseInt(str[1]), Integer.parseInt(str[2]));
		}
		String M_str = br.readLine();
		int M = Integer.parseInt(M_str);
		String[] search_str = (br.readLine()).split(" ");
		for (int i = 0; i < M; i ++) {
			int search_no = Integer.parseInt(search_str[i]);
			for (int j = 0; j < N; j ++) {
				if (search_no == stu[j].try_no) {
					System.out.println(stu[j].id + " " + stu[j].no); break;
				}
			}
		}
		
	}

}

class Student1041 {
	String id;
	int try_no;
	int no;
	
	public Student1041() {
		this("", 0, 0);
	}
	
	public Student1041(String initId, int tryno, int n) {
		id = initId;
		try_no = tryno;
		no = n;
	}
}