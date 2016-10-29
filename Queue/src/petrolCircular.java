import java.util.LinkedList;
import java.util.Queue;

public class petrolCircular {

	static class pet{
		int petrol;
		int distance;
		public pet(int p,int d){
			petrol=p;
			distance=d;
		}
	}
	
	public static void main(String args[]){
		pet arr[] = new pet[4];
		arr[0]=new pet(4, 6);
		arr[1]=new pet(6, 5);
		arr[2]=new pet(7, 3);
		arr[3]=new pet(4, 5);
		
		//{{6, 4}, {3, 6}, {7, 3}}
				
		Queue<pet> q= new LinkedList<pet>();
		q.add(arr[0]);
		q.add(arr[1]);
		q.add(arr[2]);
		q.add(arr[3]);
		
		int petrol=0;
		int distance=0;
		int diff=0;
		int minIndex=0;
		for(int i=0;i<arr.length;i++)
		{
			int tempDiff=0;
			
			diff=diff+q.peek().petrol-q.peek().distance;
			petrol=petrol+q.peek().petrol;
			distance=distance+q.peek().distance;
			//System.out.println(diff);
			if(diff<0)
			{
				minIndex=i+1;
				diff=0;
			}
			q.poll();
			
			//tempDiff=q.peek().petrol-q.peek().distance;
		}
		System.out.println(minIndex);
		
	}
}
