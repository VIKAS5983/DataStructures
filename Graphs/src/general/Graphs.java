package general;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graphs {
	private int v;
	private LinkedList<Integer> adj[];
	
	public Graphs(int v) {
		this.v=v;
		adj=new LinkedList[v];
		
		for(int i=0;i<v;i++)
			adj[i]=new LinkedList();
	}
	
	
	public static void main(String args[])
    {
    /*    Graphs g = new Graphs(4);
 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
       System.out.println("Following is Breadth First Traversal "+
                           "(starting from vertex 2)");
 
        g.DFS(2); */
		  /* Graphs g=new Graphs(4);
		   g.addEdge(0, 1);
		    g.addEdge(0, 2);
		    g.addEdge(1, 2);
		    g.addEdge(2, 0);
		    g.addEdge(2, 3);
		    g.addEdge(3, 3);
		 //   System.out.println(g.findMotherVertex(g));	
		   int[][] arr=g.transitiveClosure();
		   g.print2dArray(arr);*/
		
/*	    int k = 3;
	    Graphs g1=new Graphs(9);
	    g1.addEdge(0, 1);
	    g1.addEdge(0, 2);
	    g1.addEdge(1, 2);
	    g1.addEdge(1, 5);
	    g1.addEdge(2, 3);
	    g1.addEdge(2, 4);
	    g1.addEdge(2, 5);
	    g1.addEdge(2, 6);
	    g1.addEdge(3, 4);
	    g1.addEdge(3, 6);
	    g1.addEdge(3, 7);
	    g1.addEdge(4, 6);
	    g1.addEdge(4, 7);
	    g1.addEdge(5, 6);
	    g1.addEdge(5, 8);
	    g1.addEdge(6, 7);
	    g1.addEdge(6, 8);
	    g1.printKCores(k);
	 
System.out.println("\n");	*/ 
		
/*	    Graphs g2=new Graphs(4);
	    g2.addEdge(0, 1);
	    g2.addEdge(0, 2);
	    g2.addEdge(1, 2);
	    g2.addEdge(2, 0);
	    g2.addEdge(2, 3);
	    g2.addEdge(3, 3);
	    g2.detectCycledirected();*/
		
		 Graphs g1=new Graphs(5);
		 	g1.addEdge(1, 0);
		    g1.addEdge(0, 2);
		    g1.addEdge(2, 0);
		    g1.addEdge(0, 3);
		    g1.addEdge(3, 4);

		 g1.detectCycleUndirected();
		   
	 
		
    }
	private void detectCycleUndirected(){
		int i=0;
		for(i=0;i<adj.length;i++)
		{
			boolean[] visited=new boolean[adj.length];
			
			if(undirectedUtil(visited, i))
			{	
				System.out.println("cycle exists");
				break;
			}
		}
		if(i==adj.length)
			System.out.println("Cycle not exists");
	}
	
	private boolean undirectedUtil(boolean[] visited,int n){
		if(visited[n]==true)
			{
		//	System.out.println("n is "+n);
			return true;
			
			}
		
			visited[n]=true;
		for(int k=0;k<adj[n].size();k++)
		{	

			if(undirectedUtil(visited, adj[n].get(k)))
				{
				return true;
				
				}
		}
		
		return false;
	}
	
	
	
	private void detectCycledirected(){
		for(int i=0;i<adj.length;i++)
		{
		boolean[] visited= new boolean[adj.length];
			
		ArrayList<Integer> arr=new ArrayList<Integer>();
		if(DFS(i,arr,visited))
			return;
		
		}
	}
	
	private boolean DFS(int i,ArrayList<Integer> arr,boolean[] visited){
		arr.add(i);
		if(visited[i]==true)
		{
			System.out.println(arr);
			return true;
		}
		visited[i]=true;
		for(int j=0;j<adj[i].size();j++)
		{
			
			if(DFS(adj[i].get(j),arr,visited))
				return true;
			
		}
		return false;
	}
	
	private void printKCores(int a){
		System.out.println("k- Cores : ");
		boolean flag=false;
		
		int[] vertex=new int[adj.length];
		int min=adj.length;
		int start=0;
		for(int i=0;i<adj.length;i++)
		{
			vertex[i]=adj[i].size();
			if(min>vertex[i]){
				start=i;
				min=vertex[i];
			}
		}
		
		printKCoreUtil(start,vertex);
	}
	
	private void printKCoreUtil(int start,int[] vertex){
		
		boolean[] visited=new boolean[adj.length];
		
		for(int i=0;i<adj.length;i++){
			if(visited[i]==true){
				continue;
			}
			
			
		}
		
	}
	
	private void print2dArray(int[][] arr){
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	private int[] getVisited(int i){
		int[] b=new int[adj.length];
		for(int k=0;k<b.length;k++)
			b[k]=0;
		
		Stack<Integer> st=new Stack<Integer>();
		
		st.push(i);
		b[i]=1;
		while(!st.isEmpty()){
			int temp=st.pop();
			for(int a=0;a<adj[temp].size();a++)
			{
				if(b[adj[temp].get(a)]==0)
				{
					st.add(adj[temp].get(a));
					b[adj[temp].get(a)]=1;
				}	
			}
			
		
		}
		
		return b;
	}
	private int[][] transitiveClosure(){
		int[][] tr=new int[adj.length][];
		
		for(int i=0;i<adj.length;i++){
			
			int[] b=new int[adj.length];
			b=getVisited(i);
			tr[i]=b;
		}
		
		
		return tr;
	}
	
	
	private int findMotherVertex(Graphs g)
	{
		
		boolean[][] b=new boolean[adj.length][adj.length];
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
				b[i][j]=false;
		}
		for(int i=0;i<adj.length;i++){
			
			Queue<Integer> q=new LinkedList<Integer>();
			q.add(i);
			
			while(!q.isEmpty()){
				int temp=q.remove();
				
				for(int k=0;k<adj[temp].size();k++)
				{
					if(b[i][adj[temp].get(k)]==false)
					{
						q.add(adj[temp].get(k));
						b[i][adj[temp].get(k)]=true;

					}	
				}	
			}
		}
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print(b[i][j]+" ");
				if(b[i][j]==false && i!=j)
					break;
				else{
					if(j==b[i].length-1)
						return i;
				}
			}
			System.out.println();
		}
		
		return -1;
	}

	private void addEdge(int i, int j) {
		adj[i].add(j);
	}
	
	private void DFS(int vertice){
		boolean[] visited =new boolean[v];
		Stack<Integer> st=new Stack<Integer>();
		st.push(vertice);
		while(!st.isEmpty()){
			int temp=st.pop();
			visited[temp]=true;
			System.out.print(temp+" ");
			int size=adj[temp].size();
			for(int i=size-1;i>=0;i--){
				int item=adj[temp].get(i);
			if(visited[item]==false)
				st.push(item);
			}
			
		}
		
	}
	
	
	private void  BFS(int vertice){
	boolean[] visited= new boolean[v];
		
		int num=adj[vertice].size();
		
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(vertice);
		
//		/System.out.println(vertice+" ");
		while(!q.isEmpty()){
			int curr=q.peek();
			
			visited[curr]=true;	
			int size=adj[curr].size();
			for(int i=0;i<size;i++)
			{
			int a=adj[curr].get(i);
			if(visited[a]==false)
			q.add(a);
			}
			System.out.println(q.remove()+" ");
			
			
		}
	
	}
	
	
}
