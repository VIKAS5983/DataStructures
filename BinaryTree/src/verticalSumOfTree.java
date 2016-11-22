import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class verticalSumOfTree {

	public static void main(String args[]){
		
		   Node tree= new Node(1);
	       tree.left = new Node(2);
	       tree.right = new Node(3);
	       tree.right.right=new Node(7);
	       tree.right.left = new Node(6);
	       tree.left.right = new Node(5);
	       tree.left.left=new Node(4);
	       
	       SaveSumTree(tree,0);
	       
	       printHashMap();
	}
	public static void printHashMap(){
			Collection<Integer> arr=save.values();
			
			Iterator<Integer> it=arr.iterator();
			
			while(it.hasNext()){
				System.out.println(it.next());
				
			}
	}
	
	public static HashMap<Integer, Integer> save= new HashMap<>();
	
	public static void SaveSumTree(Node n1,int key){
		if(n1==null)
			return;
		
		if(save.containsKey(key))
		{
			int oldValue=save.get(key);
			save.replace(key, oldValue, oldValue+n1.key);
		}else{
			save.put(key, n1.key);	
		}
		SaveSumTree(n1.left, key-1);
		SaveSumTree(n1.right, key+1);
		
	}
}
