package general;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class topologicalGraph {
	    private int v;   // No. of vertices
	 
	    // Array  of lists for Adjacency List Representation
	    private LinkedList<Integer> adj[];
	 
	    // Constructor
	    topologicalGraph(int v)
	    {
	        this.v = v;
	        adj = new LinkedList[v];
	        for (int i=0; i<v; ++i)
	            adj[i] = new LinkedList();
	    }
    public static void main(String args[])
    {
    	topologicalGraph g = new topologicalGraph(6);
 
    		g.addEdge(5, 2);
    	    g.addEdge(5, 0);
    	    g.addEdge(4, 0);
    	    g.addEdge(4, 1);
    	    g.addEdge(2, 3);
    	    g.addEdge(3, 1);
 
        System.out.println("Following is Depth First Traversal "+
                           "(starting from vertex 2)");
 
       // g.DFS(2);
        //g.topologicalSort();
        //g.allTopologicalSort();
        g.KhansTopologicalSort();
    }
    
    private void KhansTopologicalSort(){
    	int[] inNodes=new int[adj.length];    	
    	System.out.println(inNodes.length);
    	//Calculating the inNodes of the complete graph
    	for(int i=0;i<adj.length;i++)
    	{
    		int temp=adj[i].size();
    		int k=0;
    		while(k<temp ){
    			inNodes[adj[i].get(k)]++;
    			k++;
    		}
    	}

    	Queue<Integer> q=new LinkedList<Integer>();
    	for(int i=0;i<inNodes.length;i++)
    		if(inNodes[i]==0)
    			{q.add(i);
    			}
    	System.out.println(khansUtil(inNodes,q));
    }
    
	private Queue<Integer> khansUtil(int[] inNodes,Queue<Integer> q) {
	
	Queue<Integer> sortedQ=new LinkedList<Integer>();

	while(!q.isEmpty()){
		int curr=q.remove();
		
		sortedQ.add(curr);
		for(int j=0;j<adj[curr].size();j++)
		{
			inNodes[adj[curr].get(j)]--;
			if(inNodes[adj[curr].get(j)]==0)
				q.add(adj[curr].get(j));
			
		}
		
		
	}
	return sortedQ;
		
		
		
	}
	private void allTopologicalSort() {
		
		
		for(int i=0;i<adj.length;i++)
			{
				boolean[] visited=new boolean[v];
				ArrayList<Integer> st=new ArrayList<Integer>();

				AlltopoUtil(i,st,visited);
			}
		
	}
	
	private void AlltopoUtil(int i, ArrayList<Integer> st, boolean[] visited){
		if(visited[i]==true){
			
			return;	
			}
		visited[i]=true;
		st.add(i);
		for(int k=0;k<adj.length;k++)
		{
			i=k;
		for(int j=0;j<adj[i].size();j++)
		{	
			boolean[] temp=visited.clone();
			ArrayList<Integer> tempar=(ArrayList<Integer>) st.clone();

		//	System.out.println("before"+ tempar);

			if(visited[adj[i].get(j)]==true)
			continue;
		
			AlltopoUtil(adj[i].get(j), st, visited);
			visited=temp;
			st=tempar;
		//System.out.println(tempar);
		}
		}
		printIfTrue(visited,st);
		return;
	}
	
	private void printIfTrue(boolean[] visited, ArrayList<Integer> st) {
		/*for(int j=0;j<visited.length;j++)
			if(visited[j]==false)
				return;*/
		
		for(int j=0;j<st.size();j++)
			System.out.print(st.get(j)+" ");
		
				System.out.println();
	}
	
	
	private void topologicalSort() {
		Stack<Integer> st=new Stack<Integer>();
		boolean[] visited=new boolean[v];
		
		for(int i=0;i<adj.length;i++)
			if(visited[i]==false)
				topoUtil(i,st,visited);
		
		while(!st.isEmpty())
			System.out.print(st.pop()+" ");
	}
	
	private void topoUtil(int i,Stack<Integer> st,boolean[] visited){
		if(visited[i]==true)
		{
			return;
		}

		for(int j=0;j<adj[i].size();j++)
			{
			if(visited[adj[i].get(j)]==true)
				continue;
			topoUtil(adj[i].get(j), st, visited);
			}
		
		visited[i]=true;
		st.push(i);

		//System.out.println(i);
	}
	
	private void DFS(int i) {
		boolean[] visited=new boolean[v];
		
		DFSUtil(i,visited);
		
	}
	
	private void DFSUtil(int i,boolean[] visited){
		if(visited[i]==true)
		{
			return;
		}
		
		visited[i]=true;

		System.out.print(i+"  ");
		
		for(int j=0;j<adj[i].size();j++)
		{
			DFSUtil(adj[i].get(j), visited);
		}
		
	}
	
	
	private void addEdge(int i, int j) {
		 adj[i].add(j);  // Add w to v's list.
		
	}
}
