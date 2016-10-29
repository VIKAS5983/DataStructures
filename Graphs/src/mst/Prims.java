package mst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Prims {
	   // Number of vertices in the graph
    private static final int V=5;
 
    // A utility function to find the vertex with minimum key
    // value, from the set of vertices not yet included in MST
    int minKey(int key[], boolean mstSet[])
    {
        // Initialize min value
        int min = Integer.MAX_VALUE, min_index=-1;
 
        for (int v = 0; v < V; v++)
            if (mstSet[v] == false && key[v] < min)
            {
                min = key[v];
                min_index = v;
            }

        	return min_index;
    }
 
    // A utility function to print the constructed MST stored in
    // parent[]
    void printMST(int parent[], int n, int graph[][])
    {
        System.out.println("Edge   Weight");
        for (int i = 1; i < V; i++)
            System.out.println(parent[i]+" - "+ i+"    "+
                               graph[i][parent[i]]);
    }
 
    // Function to construct and print MST for a graph represented
    //  using adjacency matrix representation
    void primMST(int graph[][])
    {
   int parent[]=new int[V];
   boolean[] mstIncluded=new boolean[V];
   int key[]=new int[V];
   for(int i=0;i<V;i++)
	   key[i]=Integer.MAX_VALUE;
   
   int start=0;
   key[0]=0;
   for(int i=0;i<V;i++){
	   start=minKey(key, mstIncluded);
	   	mstIncluded[start]=true;
	   	
	   	for(int j=0;j<graph[i].length;j++)
	   	{
	   		
	   		if(graph[i][j]!=0 && graph[i][j]<key[j] && mstIncluded[j]==false)
	   		{
	   			parent[j]=i;
	   			key[j]=graph[i][j];
	   		}
	   	}
	   
	   
   }
    	
        printMST(parent, V, graph);
    }
 
    
    
    
    
    
    
    
    
    
    
    public static void main (String[] args)
    {
        /* Let us create the following graph
           2    3
        (0)--(1)--(2)
        |    / \   |
        6| 8/   \5 |7
        | /      \ |
        (3)-------(4)
             9          */
    	Prims t = new Prims();
        int graph[][] = new int[][] {{0, 2, 0, 6, 0},
                                    {2, 0, 3, 8, 5},
                                    {0, 3, 0, 0, 7},
                                    {6, 8, 0, 0, 9},
                                    {0, 5, 7, 9, 0},
                                   };

        // Print the solution
        t.primMST(graph);
    }
}