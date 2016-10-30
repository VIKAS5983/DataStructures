
public class rootToLeafSum {
	
	public static void main(String args[]){
		   Node tree= new Node(10);
	       tree.left = new Node(8);
	       tree.right = new Node(2);
	       tree.left.left = new Node(3);
	       tree.left.right = new Node(5);
	       tree.right.left = new Node(2);

	      System.out.println("Tree balance status is "+pathExists(tree,21));
	 }
	
	public static boolean pathExists(Node temp,int num){
		
		if(temp==null)
			return false;
		
		if((num==temp.key) && (temp.left==null) && (temp.right==null))
		{
			return true;
		}
		

		num=num-temp.key;
		
		return pathExists(temp.left,num) || pathExists(temp.right,num);
	}
}
