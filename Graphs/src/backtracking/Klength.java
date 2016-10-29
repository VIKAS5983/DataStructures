package backtracking;

import java.util.LinkedList;

public class Klength {

	int V;
	LinkedList<Edge>[] adj;
	
	class  Edge{
		int src;
		int dest;
		int weight;
		public String toString(){
			return src+"->"+dest+"="+weight;
			
		}
	}
	
	public Klength(int v){
		V=v;
		adj=new LinkedList[v];
		
		for(int i=0;i<v;i++)
		adj[i]=new LinkedList<Edge>();
		
	}
	
	public void addEdge(int src,int dest, int weight){
		
		Edge e1=new Edge();
		e1.dest=dest;
		e1.src=src;
		e1.weight=weight;
		adj[src].add(e1);
		Edge e2=new Edge();
		e2.src=dest;
		e2.dest=src;
		e2.weight=weight;

		adj[dest].add(e2);
		
	}
	public static void main(String args[]){
		
		Klength g=new Klength(9);
			g.addEdge(0, 1, 4);
		    g.addEdge(0, 7, 8);
		    g.addEdge(1, 2, 8);
		    g.addEdge(1, 7, 11);
		    g.addEdge(2, 3, 7);
		    g.addEdge(2, 8, 2);
		    g.addEdge(2, 5, 4);
		    g.addEdge(3, 4, 9);
		    g.addEdge(3, 5, 14);
		    g.addEdge(4, 5, 10);
		    g.addEdge(5, 6, 2);
		    g.addEdge(6, 7, 1);
		    g.addEdge(6, 8, 6);
		    g.addEdge(7, 8, 7);
		 
		    boolean visited[]=new boolean[9];
		    
		    if(g.pathMoreThanK(0, 62,visited))
		    	System.out.println("Path more tha 62 exisits in the graph");
		    
		    if(g.pathMoreThanK(0,61,visited))
		    	System.out.println("Path more than 60 exists in the graph");
		    
	}
	
	public boolean pathMoreThanK(int src, int weight,boolean[] visited){
		if(weight<0)
			return true;
		
		for(int i=0;i<adj[src].size();i++)
		{
			if(visited[adj[src].get(i).dest]==true)
				continue;
//			/System.out.println(adj[src].get(i));
			visited[adj[src].get(i).dest]=true;
			if(pathMoreThanK(adj[src].get(i).dest, weight-adj[src].get(i).weight, visited))
				return true;
			
			visited[adj[src].get(i).dest]=false;
		}
		
		return false;
	}
}
