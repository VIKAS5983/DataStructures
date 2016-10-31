
public class checkSumtree {
	static boolean status=true;
	public static void main(String args[]){
		   Node tree= new Node(28);
	       tree.left = new Node(12);
	       tree.right = new Node(2);
	       tree.left.right = new Node(6);
	       tree.left.left=new Node(6);
	       tree.right.right = new Node(2);
	       IsSumTree(tree);
	     System.out.println(status);
	  		}
	
	public static int IsSumTree(Node temp){
		if(temp==null){
			return 0;
		}
		if(temp.left==null && temp.right==null)
		{
			return temp.key;
		}
		int sum=IsSumTree(temp.left)+IsSumTree(temp.right);
		if(temp.key==sum)
		{
			status=true&& status;
		}else{
			status=false;
		}
		
		
		return temp.key+sum;
	}
	
	
}
