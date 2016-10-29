package shortest;

public class Dijkstra {
	int V=9;
public static void main(String args[]){
	
    int graph[][] = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
        {4, 0, 8, 0, 0, 0, 0, 11, 0},
        {0, 8, 0, 7, 0, 4, 0, 0, 2},
        {0, 0, 7, 0, 9, 14, 0, 0, 0},
        {0, 0, 0, 9, 0, 10, 0, 0, 0},
        {0, 0, 4, 14, 10, 0, 2, 0, 0},
        {0, 0, 0, 0, 0, 2, 0, 1, 6},
        {8, 11, 0, 0, 0, 0, 1, 0, 7},
        {0, 0, 2, 0, 0, 0, 6, 7, 0}
       };
       Dijkstra t = new Dijkstra();
   	t.shortestPath(graph,0);

}
private void shortestPath(int[][] graph, int i) {

	int key[]=new int[V];
	boolean flag[]=new boolean[V];
	for(int j=0;j<key.length;j++)
	{
		key[j]=Integer.MAX_VALUE;
	}
	key[i]=0;
	
	for(int j=0;j<V;j++)
	{
		int start=minDistanceVertice(key, flag);
		//graph[j][k];
		flag[start]=true;
		
		for(int k=0;k<V;k++)
		{
			if(!flag[k] && graph[start][k]!=0 && key[start]+graph[start][k] <key[k])
			{
				key[k]=graph[start][k]+key[start];
			}
		}
	}
	
	for(int l=0;l<V;l++)
	System.out.print(key[l]+" ");
	
}


private int minDistanceVertice(int key[],boolean[] flag){
	int min=Integer.MAX_VALUE;
	int minIndex=-1;
	for(int j=0;j<V;j++)
	{
		if(flag[j]==false && key[j]<min)
		{
			min=key[j];
			minIndex=j;
		}
	}
		
return minIndex;
}


}
