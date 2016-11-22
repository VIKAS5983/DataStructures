import java.lang.reflect.Array;
import java.util.ArrayList;

public class maximumSumOfTree {
	static ArrayList<Integer> maxSum=new ArrayList<Integer>();
	
	public static void main(String args[]){
		
		
		   Node tree= new Node(10);
	       tree.left = new Node(-2);
	       tree.right = new Node(7);
	       tree.left.right = new Node(-4);
	       tree.left.left=new Node(8);
	       ArrayList<Integer> temp=new ArrayList<Integer>();
	       FindMax(tree,temp);
	       printMax(maxSum);
	}
	public static void printMax(ArrayList<Integer> max){
		
		for(int i=0;i<max.size();i++)
		{
			System.out.print(max.get(i)+" ");
		}
		
	}
	
	public static int sum(ArrayList<Integer> max){
		int num=0;
		
		for(int i=0;i<max.size();i++)
			num=num+max.get(i);
		
		return num;
	}
	public static void FindMax(Node tree,ArrayList<Integer> max){
		if(tree==null)
		{
			if(sum(max)>sum(maxSum)){
			maxSum.clear();
			maxSum.addAll(max);
			
			}
			
			return;
		}
		
		max.add(tree.key);
		//System.out.println(tree.key);
		FindMax(tree.left, max);
		FindMax(tree.right, max);
	//	System.out.println("sis "+max.size());
		max.remove(max.size()-1);
		
		return;
	}
	
	
	
}
