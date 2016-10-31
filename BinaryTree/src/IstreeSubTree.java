
public class IstreeSubTree {
	public static void main(String args[]){
		   Node tree= new Node(26);
	       tree.left = new Node(10);
	       tree.right = new Node(3);
	       tree.right.right = new Node(3);
	       tree.left.right = new Node(6);
	       tree.left.left=new Node(4);
	       tree.left.left.right=new Node(30);
	       
		   Node tree1= new Node(10);
	       tree1.left = new Node(4);
	       tree1.right = new Node(6);
	       tree1.left.right = new Node(30);

	       System.out.println(IsSubTree(tree,tree1));
	}
	
	
	public static boolean IsSubTree(Node temp1,Node temp2){
		if(temp2==null)
			return false;
		if(temp2.key==temp2.key)
		{
			if(Identical(temp1, temp2))
				return true;
		}
		
		return IsSubTree(temp1, temp2.left) || IsSubTree(temp1, temp2.right);
	}
	
	public static boolean Identical(Node temp1,Node temp2){
		if(temp1==null && temp2==null)
			return true;
		if(temp1==null || temp2==null)
			return false;
		
		if(temp1.key!=temp2.key)
			return false;
		
		return Identical(temp1.left, temp2.left) && Identical(temp1.right, temp2.right);
	}
}
