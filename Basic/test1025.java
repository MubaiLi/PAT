package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1025 {
	public static int cnt = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = (br.readLine()).split(" ");
		int firstAdd = Integer.parseInt(str[0]);
		int N = Integer.parseInt(str[1]);
		int K = Integer.parseInt(str[2]);

		Node[] node = new Node[100000];
		for (int i  = 0; i < N; i ++) {
			String[] strOfNode = (br.readLine()).split(" ");
			Node tmp = new Node();
			tmp.address = Integer.parseInt(strOfNode[0]);
			tmp.data = Integer.parseInt(strOfNode[1]);
			tmp.next = Integer.parseInt(strOfNode[2]);
			node[tmp.address] = tmp;
		}
		
		Node[] list = link(node, firstAdd, N);
		Node[] listRev = reverse(list, cnt, K);
		
		for (int i = 0; i < cnt - 1; i ++) {
			System.out.printf("%05d %d %05d\n", listRev[i].address, listRev[i].data, listRev[i + 1].address);
		}
		System.out.printf("%05d %d -1", listRev[cnt - 1].address, listRev[cnt - 1].data);
		

	
	}
	
	public static Node[] link(Node[] node, int firstAdd, int N) {
		Node[] list = new Node[N];
		while (firstAdd != -1) {
			list[cnt] = node[firstAdd];
			firstAdd = node[firstAdd].next;
			cnt ++;
		}
		return list;
	}
	
	public static Node[] reverse(Node[] list, int N, int k) {
		for (int i = 0; i + k < N; i += k) {
			for (int m = i + k - 1, n = i; m >= n; m --, n ++) {
				swap(list[m], list[n]);
			}
		}
		return list;
	}
	
	public static void swap(Node x, Node y) {
		int tmpAdd = x.address;
		int tmpData = x.data;
		int tmpNext = x.next;
		x.setAdd(y.getAdd());
		x.setData(y.getData());
		x.setNext(y.getNext());
		y.setAdd(tmpAdd);
		y.setData(tmpData);
		y.setNext(tmpNext);
	}

}

class Node {
	int address;
	int data;
	int next;
	
	public Node() {
		this(-1,0,-1);
	}
	public Node(int initaddress, int initdata, int initnext) {
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
