package com.kh.BFS;

import java.util.LinkedList;
import java.util.Queue;
/*
 BFSMain
 �׷����� BFSŽ���� �����ϰ�, 
 �־��� ���� ���κ��� ��� ����� ��带
 �ʺ� �켱���� Ž��
 * */
public class BFSMain {
	public static void main(String[] args) {
		//Graph ����
		Graph g = new Graph(10);
		//���� �߰�
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 3);
		g.addEdge(1, 4);
		g.addEdge(2, 5);
		g.addEdge(2, 6);
		g.addEdge(3, 7);
		g.addEdge(4, 8);
		g.addEdge(5, 9);
		System.out.println("BFS Ž�� ��� : ");
		//BFS�� ���� ��� 0 ���� ȣ���ؼ� ����
		g.BFS(0);
		System.out.println();
		System.out.println("===1===");
		g.BFS(1);
		System.out.println();
		System.out.println("===2===");
		g.BFS(2);
		System.out.println();
		System.out.println("===3===");
		g.BFS(3);
		System.out.println();
		System.out.println("===4===");
		g.BFS(4);
		System.out.println();
		System.out.println("===5===");
		g.BFS(5);
		System.out.println();
		System.out.println("===6===");
		g.BFS(6);
		System.out.println();
		System.out.println("===7===");
		g.BFS(7);
		System.out.println();
		System.out.println("===8===");
		g.BFS(8);
		System.out.println();
		System.out.println("===9===");
		g.BFS(9);
		//����� BFS �� Ž�� ����� ��� ������ ���

	}

}
