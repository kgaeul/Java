package chap33_practiceGraph;

import java.util.LinkedList;

public class PracticeMain {

	private int V;
	private LinkedList<Integer>[] adjList;
	
	public PracticeMain(int ver) {
		V= ver;
		adjList = new LinkedList[ver];
		for(int i=0; i<ver;i++) {
			adjList[i] = new LinkedList<>();
		}
	}
	
	public void addEdge(int source, int des) {
		adjList[source].add(des);
	}
	
	public void DFS(int startNode) {
		//방문여부를 추적하기 위한 visited 배열 초기화
		boolean[] visited = new boolean[V];
		DFSUtill(startNode,visited);
	}
	private void DFSUtill(int currentNode, boolean[]visited) {
		visited[currentNode]= true;
		System.out.println(currentNode+" ");
		
		for(int neighbor : adjList[currentNode]) {
			if(!visited[neighbor]) {
				DFSUtill(neighbor,visited);
			}
		}
	}
}