
public class levelOfNode {
	public static void main(String args[]){
		   Node tree= new Node(3);
	       tree.left = new Node(2);
	       tree.right = new Node(5);
	       //tree.right.left = new Node(8);
	       tree.left.right = new Node(4);
	       tree.left.left=new Node(1);
	       levelNode(tree,1);
	       
	      // Inorder.inorderWithRecursion(tree);
		}
	static int findNum=4;
	public static void levelNode(Node n,int num){
		if(n==null)
			return ;
		
		if(n.key==findNum)
		{
			System.out.println(num);
		}
		
		levelNode(n.left, num+1);
		levelNode(n.right, num+1);
		return ;
	}
	
}
