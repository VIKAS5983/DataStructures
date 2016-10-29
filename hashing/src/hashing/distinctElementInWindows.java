package hashing;

import java.util.HashMap;

public class distinctElementInWindows {
	
	public static void main(String args[]){
		int arr[] = {1, 2, 1, 3, 4, 2, 3};
		int k=4;
		distinctElements(arr,k);
		
	}

	private static void distinctElements(int[] arr,int k) {
		HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
		int distinctValue=0;
		for(int i=0;i<arr.length;i++){
			
			if(!h.containsKey(arr[i]))
			{
				h.put(arr[i], 1);
				distinctValue++;
			//	System.out.println(arr[i] +" "+ h.get(arr[i]));
			//		int arr[] = {1, 2, 1, 3, 4, 2, 3};

			}else{
				h.put(arr[i],h.get(arr[i])+1);
			//	System.out.println(arr[i] +" "+ h.get(arr[i]));
			//		int arr[] = {1, 2, 1, 3, 4, 2, 3};
	
			}

			if(i>=k)
			{
				if(h.get(arr[i-k])==1)
				{
					h.remove(arr[i-k]);
					//System.out.println("removing "+(i-k)+" "+arr[i-k] +" "+ h.get(arr[i-k]));
					//		int arr[] = {1, 2, 1, 3, 4, 2, 3};

					//distinctValue--;
				}
				else{
					//	System.out.println(arr[i-k] +" "+ h.get(arr[i-k]));

					h.put(arr[i-k],h.get(arr[i-k])-1);
					//System.out.println(arr[i-k] +" "+ h.get(arr[i-k]));
					//		int arr[] = {1, 2, 1, 3, 4, 2, 3};

				}
			}
			
			
			if(i>=k-1)
			System.out.println(h.size());
			
			
		}
		
	}
}
