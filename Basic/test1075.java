package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1075 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = (br.readLine()).split(" ");
		int firstAdd = Integer.parseInt(str[0]);
		int N = Integer.parseInt(str[1]);
		int K = Integer.parseInt(str[2]);
		
		Node1[] node = new Node1[100000];
		for (int i  = 0; i < N; i ++) {
			String[] strOfNode = (br.readLine()).split(" ");
			Node1 tmp = new Node1();
			tmp.address = Integer.parseInt(strOfNode[0]);
			tmp.data = Integer.parseInt(strOfNode[1]);
			tmp.next = Integer.parseInt(strOfNode[2]);
			node[tmp.address] = tmp;
		}
		
		Node1[] list = link(node, firstAdd, N);
		
		Node1[] ans = new Node1[N];
		int m = 0;
		for (int i = 0; i < N; i ++) {
			if (list[i].data < 0) {
				ans[m ++] = list[i];
			}
		}
		for (int i = 0; i < N; i ++) {
			if (list[i].data >= 0 && list[i].data <= K) {
				ans[m ++] = list[i];
			}
		}
		for (int i = 0; i < N; i ++) {
			if (list[i].data > K) {
				ans[m ++] = list[i];
			}
		}
		
		for (int i = 0; i < N - 1; i ++) {
			ans[i].setNext(ans[i + 1].getAdd());
		}

		
		for (int i = 0; i < N - 1; i ++) {
			System.out.printf("%05d %d %05d\n", ans[i].address, ans[i].data, ans[i + 1].address);
		}
		System.out.printf("%05d %d -1", ans[N - 1].address, ans[N - 1].data);
		
		
	}
	
	public static Node1[] link(Node1[] node, int firstAdd, int N) {
		Node1[] list = new Node1[N];
		int cnt = 0;
		while (firstAdd != -1) {
			list[cnt] = node[firstAdd];
			firstAdd = node[firstAdd].next;
			cnt ++;
		}
		return list;
	}
	
}

class Node1 {
	int address;
	int data;
	int next;
	
	public Node1() {
		this(-1,0,-1);
	}
	public Node1(int initaddress, int initdata, int initnext) {
		address = initaddress;
		data = initdata;
		next = initnext;
	}
	public int getAdd() {
		return address;
	}
	public int getData() {
		return data;
	}
	public int getNext() {
		return next;
	}
	public void setAdd(int newAdd) {
		address = newAdd;
	}
	public void setData(int newData) {
		data = newData;
	}
	public void setNext(int newNext) {
		next = newNext;
	}
}
