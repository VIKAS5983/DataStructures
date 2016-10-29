package heap;

import java.util.Comparator;
import java.util.PriorityQueue;


public class minHeapAndmaxHeap {

	 
	public static void main(String args[]){
		int size=10;
		
		PriorityQueue<Integer> minHeap=new PriorityQueue<Integer>();
		PriorityQueue<Integer> maxHeap=new PriorityQueue<Integer>(size, new MyComparator());
	
		minHeap.size();
		minHeap.add(10);
	}
}

class MyComparator implements Comparator<Integer>
{
    public int compare( Integer x, Integer y )
    {
        return y - x;
    }
}