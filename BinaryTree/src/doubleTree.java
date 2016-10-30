
public class doubleTree {
	public static void main(String args[]){
		   Node tree= new Node(1);
	       tree.left = new Node(2);
	       tree.right = new Node(3);
	       tree.left.left = new Node(4);
	       tree.left.right = new Node(5);

	       createDoubleTree(tree);
	 
	Inorder.inorderWithRecursion(tree);
	}
	
	public static void createDoubleTree(Node n){
		if(n==null)
			return;
		
		Node temp=new Node(n.key);
		temp.left=n.left;
		n.left=temp;
		createDoubleTree(temp.left);
		createDoubleTree(n.right);
		
		return;
	}
}
