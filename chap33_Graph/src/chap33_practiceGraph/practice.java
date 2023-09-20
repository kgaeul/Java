package chap33_practiceGraph;

public class practice {

	public static void main(String[] args) {

		int ver = 10;
		
		PracticeMain pm = new PracticeMain(ver);
		
		pm.addEdge(0, 1);
		pm.addEdge(0, 2);
		pm.addEdge(1, 3);
		pm.addEdge(2, 3);
		pm.addEdge(3, 5);
		pm.addEdge(5, 7);
		pm.addEdge(7, 4);
		pm.addEdge(5, 9);
		
		System.out.println("Å½»ö ÇÒ °á°ú");
		pm.DFS(0);
		
		
	}

}
