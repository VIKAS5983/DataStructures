package heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Heapsort {

	public static void printArray(int[] arr){
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
	}
	
	public void sort(int [] arr){
		PriorityQueue<Integer> maxHeap=new PriorityQueue<Integer>(new myComp());

		for(int i=0;i<arr.length;i++)
			maxHeap.add(arr[i]);
		
		for(int i=0;i<arr.length;i++)
			arr[i]=maxHeap.remove();
		
	}
	
	
	public static void heapifyAndSort(int arr[]){
		for(int i=arr.length-1;i>=0;i--)
		{
		maxHeapify(arr, arr.length, i);
		}
		printArray(arr);
		
		for(int i=arr.length-1;i>=0;i--)
		{
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			
		maxHeapify(arr, i, 0);
		}
		
		
	}
	
	public static  void maxHeapify(int arr[],int len,int index){
		int lc=2*index;
		int rc=2*index+1;
		int largest=index;
		if(lc<len && arr[lc]>arr[index])
			largest=lc;
		
		if(rc<len && arr[rc]>arr[largest])
			largest=rc;
		
		if(largest!=index)
		{
			int temp=arr[index];
			arr[index]=arr[largest];
			arr[largest]=temp;
			
			maxHeapify(arr, len, largest);
		}
	}
	
	public static void main(String args[]){
		
		PriorityQueue<Integer> minHeap=new PriorityQueue<Integer>();
		
	       int arr[] = {12, 11, 13, 5, 6, 7};
	        int n = arr.length;
	 
	        Heapsort ob = new Heapsort();
	      //  ob.sort(arr);
	        heapifyAndSort(arr);
	        
	        System.out.println("Sorted array is");
	        printArray(arr);
	}
}


class myComp implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2-o1;
	}
	
}