package com.kh.Practice;

public class BFSPracticeMain {

	public static void main(String[] args) {

		PracticeGraph pg = new PracticeGraph(10);
		
		System.out.println("BFS Å½»ö °á°ú : ");
		
		pg.addEdge(0, 1);
		pg.addEdge(0, 2);
		pg.addEdge(1, 3);
		pg.addEdge(2, 3);
		pg.addEdge(3, 7);
		pg.addEdge(3, 5);
		pg.addEdge(5, 7);
		pg.addEdge(5, 6);
		pg.addEdge(6, 7);
		
		pg.BFS(0);
		
		
		
	}

}
