
public class convertTreeToSumTree {
	public static void main(String args[]){
	   Node tree= new Node(10);
       tree.left = new Node(-2);
       tree.right = new Node(6);
       tree.right.right=new Node(5);
       tree.right.left = new Node(7);
       tree.left.right = new Node(-4);
       tree.left.left=new Node(8);
       
       Inorder.inorderWithRecursion(tree);
       
       System.out.println();
       convertTree(tree);   
       Inorder.inorderWithRecursion(tree);
	}

public static int convertTree(Node n1){
	
	if(n1==null){
		return 0;
	}
	
	if(n1.left==null && n1.right==null)
	{
		int num=n1.key;
		n1.key=0;
		
		return num;
	}
	
	int left=convertTree(n1.left);
	int right=convertTree(n1.right);
	int num=n1.key;
	n1.key=left+right;
	
	return n1.key+num;
}



}
