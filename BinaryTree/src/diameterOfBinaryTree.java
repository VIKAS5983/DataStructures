
public class diameterOfBinaryTree {
	
	public static void main(String args[]){
        Node tree= new Node(50);
        tree.left = new Node(7);
        tree.right = new Node(2);
        tree.left.left = new Node(3);
        tree.left.right = new Node(5);
     /*   tree.right.left=new Node(1);
        tree.right.right = new Node(30);*/
    //   System.out.println("Status is "+ isSumProperty(tree));
       
       System.out.println("diamter is "+diameter(tree));
       
     //  Inorder.inorderTraversalWithStack(tree);
	}
	public static int diameter(Node n1){
		System.out.println("Left child depth "+diameterUtil(n1.left));
		System.out.println("Right child depth "+diameterUtil(n1.right));
		return diameterUtil(n1.left)+diameterUtil(n1.right)+1;
	}
	public static int diameterUtil(Node n1){
		
		if(n1==null)
			return 0;
		
		if(n1.left==null && n1.right==null)
			return 1;
		if(n1.left==null)
			return diameterUtil(n1.right)+1;
		if(n1.right==null)
			return diameterUtil(n1.left)+1;
		
		return Math.max(diameterUtil(n1.left), diameterUtil(n1.right))+1;
	}
	
}
