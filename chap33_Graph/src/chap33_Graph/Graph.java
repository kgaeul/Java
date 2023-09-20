package chap33_Graph;

public class Graph {

	public static void main(String[] args) {

		int ver =5; //노드의 수를 5로 정의
		GraphMain GraphM = new GraphMain(ver);
		
		//간선을 추가한 것
		GraphM.addEdge(0,1); //노드 0에서 1로 방향이 있는 엣지 추가
		GraphM.addEdge(0,2); //노드 0에서 2로 방향이 있는 엣지 추가
		GraphM.addEdge(1,3); //노드 1에서 2로 방향이 있는 엣지 추가
		GraphM.addEdge(2,4); //노드 2에서 4로 방향이 있는 엣지 추가
		GraphM.addEdge(3,5);
		GraphM.addEdge(4,7);
		
		System.out.println();
		GraphM.DFS(0); //DFS 탐색을 시작할 노드의 번호를 전달
		
		/*
		 DFS 탐색을 시작하여 그 결과를 출력
		 탐색 결과는 시작 노드에서 출발하여 깊이 우선으로 탐색 후 노드를 방문한 순서대로 출력
		 */
	}

}
