
public class ChildrenSum {

	public static boolean isSumProperty(Node n1){
		
		if(n1.left==null && n1.right==null)
			return true;

		if(n1.left==null)
		{
			if(n1.key==n1.right.key)
				return isSumProperty(n1.right);
			else
				return false;
		}
		
		if(n1.right==null)
		{
			if(n1.key==n1.left.key)
				return isSumProperty(n1.left);
			else{
				return false;
			}
		}
		
		if(n1.key!=n1.left.key+n1.right.key)
			return false;
		
		return isSumProperty(n1.left)&& isSumProperty(n1.right);
	}
	
	public static void main(String args[]){
        Node tree= new Node(50);
        tree.left = new Node(7);
        tree.right = new Node(2);
        tree.left.left = new Node(3);
        tree.left.right = new Node(5);
        tree.right.left=new Node(1);
        tree.right.right = new Node(30);
    //   System.out.println("Status is "+ isSumProperty(tree));
       
       convertArbitaryToChildrenSum(tree);
       
       Inorder.inorderTraversalWithStack(tree);
	}
	
	
	public static int convertArbitaryToChildrenSum(Node n1){
		
		if(n1.left==null && n1.right==null)
			return n1.key;
		if(n1.left==null)
			return	convertArbitaryToChildrenSum(n1.right);
		if(n1.right==null)
			return convertArbitaryToChildrenSum(n1.left);
		
		n1.key=convertArbitaryToChildrenSum(n1.left)+convertArbitaryToChildrenSum(n1.right);
		
		return n1.key;
	}
}
