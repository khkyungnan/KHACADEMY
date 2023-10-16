package com.kh.BFS;

import java.util.LinkedList;
import java.util.Queue;
/*
 BFSMain
 그래프의 BFS탐색을 구현하고, 
 주어진 시작 노드로부터 모든 연결된 노드를
 너비 우선으로 탐색
 * */
public class BFSMain {
	public static void main(String[] args) {
		//Graph 생성
		Graph g = new Graph(10);
		//간선 추가
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 3);
		g.addEdge(1, 4);
		g.addEdge(2, 5);
		g.addEdge(2, 6);
		g.addEdge(3, 7);
		g.addEdge(4, 8);
		g.addEdge(5, 9);
		System.out.println("BFS 탐색 결과 : ");
		//BFS를 시작 노드 0 에서 호출해서 실행
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
		//결과는 BFS 의 탐색 결과인 노드 순서를 출력

	}

}
