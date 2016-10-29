package general;

public class KPaths {

    public static void main (String[] args) throws java.lang.Exception
    {
        /* Let us create the graph shown in above diagram*/
        int graph[][] =new int[][] {
        	{0, 0, 1, 1, 0},
            {1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0},
            {0, 0, 0, 0, 1},
            {0, 0, 0, 0, 0}
        };
        int u = 0, v = 1, k = 2;
        KPaths p = new KPaths();
        p.countwalks(graph, u, v, k);
        
        System.out.println(num);
        
        System.out.println("mother vertex "+ p.findMotherVertex(graph));
    }
    private int findMotherVertex(int[][] graph){
    	int v=graph.length;
    	for(int i=0;i<v;i++)
    	{
    	boolean[] visited=new boolean[v];
    		for(int j=0;j<v;j++){
    			if(graph[i][j]!=0)
    			{
    				if(j==v-1)
    					return i;
    				continue;
    			}
    			break;
    		}
    	}
    	
    	
    	return -1;
    }
    
    
    static int num=0;
	private int countwalks(int[][] graph, int u, int v, int k) {
		
		if(k<=0){
			if(u==v)
			{
			//	System.out.println("u is equal v");
				
				num++;
				return 0;
			}
			return 0;
		}
			int size=graph[u].length;
				for(int i=0;i<size;i++)
			{
				if(graph[u][i]==1)
				countwalks(graph, i, v, k-1);
				
			}
		
		return 0;
	}
}
