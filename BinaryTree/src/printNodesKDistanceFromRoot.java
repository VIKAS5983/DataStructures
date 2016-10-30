
public class printNodesKDistanceFromRoot {
	public static void main(String args[]){
		   Node tree= new Node(1);
	       tree.left = new Node(2);
	       tree.right = new Node(3);
	       tree.right.left = new Node(8);
	       tree.left.right = new Node(5);
	       tree.left.left=new Node(4);
	       kDistanceNodes(tree,2);
	      // Inorder.inorderWithRecursion(tree);
		}
		
	
	
	public static void kDistanceNodes(Node n,int num){
		if(n==null)
			return;
		
		if(num==0)
		{
			System.out.print(n.key+" ");
			return;
		}
		kDistanceNodes(n.left, num-1);
		kDistanceNodes(n.right, num-1);
		return ;
	}
	
}
