package com.kh.GraphMain;

public class GraphMain {

	public static void main(String[] args) {
		int ver = 15; //�׷��� ���� ���� 5�� ����
		Graph graph = new Graph(ver);
		
		//addEdge  ���� �߰��ϰڴ�.
		graph.addEdge(0, 1); //��� 0���� ��� 1�� ������ �ִ� ������ �߰�
		graph.addEdge(0, 2); //��� 0���� ��� 2�� ������ �ִ� ������ �߰�
		graph.addEdge(1, 3);
		graph.addEdge(2, 4);
		graph.addEdge(3, 1); //��� 0���� ��� 1�� ������ �ִ� ������ �߰�
		graph.addEdge(4, 2); //��� 0���� ��� 2�� ������ �ִ� ������ �߰�
		graph.addEdge(5, 3);
		graph.addEdge(6, 7);
		System.out.println("DFS Ž�� ��� : ");

		// DFS Ž���� ������ ����� ��ȣ�� ����
		//0���� ������
		graph.DFS(4); // 0 1 3 2 4 
	}
}

/* DFS Ž���� �����Ͽ� �� ����� ���
 * Ž�� ����� ���� ��忡�� ����Ͽ� 
 * ���� �켱���� Ž�� �� ��带 �湮�� ������� ���
 * */







