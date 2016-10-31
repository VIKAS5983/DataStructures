
public class printAncestorOfNode {
	public static void main(String args[]){
		   Node tree= new Node(1);
	       tree.left = new Node(2);
	       tree.right = new Node(3);
	       tree.left.right = new Node(5);
	       tree.left.left=new Node(4);
	       tree.left.left.left = new Node(7);

	       printAncestor(tree,7);
	  		}
	
		public static boolean printAncestor(Node temp,int num){
			if(temp==null)
			{
				return false;
			}
		
			if(temp.key==num)
			{
				//	System.out.println(temp.key);
				return true;
			}
		
		
			if( printAncestor(temp.left, num) || printAncestor(temp.right, num))
			{
				System.out.println(temp.key);
				return true;
			}
			
			return false;
		}
	
}
