import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class maxFromSubArray {
public static void main(String args[]){
	int[] array={9,6,11,8,10,5,14,13,93,14};
	printMaxFromSubarray(array, 4);
	
}
public static void printMaxFromSubarray(int[] array,int num){
	
	Deque<Integer> d=new ArrayDeque<Integer>();
	
	for(int j=0;j<array.length;j++){
		
		if(d.size()==0)
		{
			d.addFirst(j);
		}else{
			if(array[j]>array[d.peekFirst()])
			{
				d.clear();
				d.addFirst(j);
			}else{
				ArrayList<Integer> ar=new ArrayList<Integer>();
				while(array[j]>array[d.peekLast()]){
					ar.add(d.removeLast());
				}
				
				d.addLast(j);
				for(int k=ar.size()-1;k>=0;k--){
					d.addLast(ar.get(k));
				}
				ar.clear();
			}
		}
		
		if(j>=num-1)
		{
			while(j-num>=d.peekFirst()){
				d.removeFirst();
			}
			System.out.print (array[d.peekFirst()]+" ");
		}
		
	}
	
}
}
