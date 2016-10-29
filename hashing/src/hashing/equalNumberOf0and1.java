package hashing;

import java.util.HashMap;

public class equalNumberOf0and1 {
	class bitClass{
		int one=0;
		int two=0;
	}
	
	public static void main(String args[]){
	int arr[] = {0, 0, 1, 1, 0};
	
	HashMap<Integer, Integer> h=new HashMap<Integer,Integer>();
	int diff=0;
	int maxValue=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==0)
			diff--;
		else{
			diff++;
		}
		if(h.containsKey(diff))
			{
			int min=h.get(diff);
				maxValue=i-min;
			}
		else{
			h.put(diff, i);
		}
		
	}
	
	System.out.println(maxValue);
	
	}
}
