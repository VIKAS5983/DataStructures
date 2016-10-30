
public class foldable {
	public static void main(String args[]){
	   Node tree= new Node(10);
       tree.left = new Node(7);
       tree.right = new Node(15);
       tree.right.left = new Node(11);
       tree.left.right = new Node(5);
       tree.left.left=new Node(10);
       System.out.println(isfoldable(tree));
       Inorder.inorderWithRecursion(tree);
	}
	
	public static boolean isfoldable(Node n){
		
		//	Node temp=createNewTree(n);
		//Inorder.inorderWithRecursion(temp);
		
		return compare(n.left, n.right)	;
	}
	
	public static boolean compare(Node n1,Node n2){
		
		if(n1==null && n2==null)
		{	
			return true;
		}
		if(n1==null || n2==null)
		{
			return false;
		}

		return compare(n1.left, n2.right) && compare(n1.right, n2.left);
		
	}
	
	public static Node createNewTree(Node n){
		if(n==null)
			return null;
		
		Node temp=new Node(n.key);
		temp.left=createNewTree(n.right);
		temp.right=createNewTree(n.left);
		
		return temp;
	}
	
	
}
