
public class modifyBST {
public static void main(String args[]){
	   Node tree= new Node(10);
       tree.left = new Node(8);
       tree.right = new Node(12);
       tree.right.right = new Node(14);
       tree.left.right = new Node(9);
       tree.left.left=new Node(5);
       tree.left.left.right=new Node(7);
       System.out.println(searchBST(7, tree));
       inorderBST(tree);
       insert(tree, 11);
       System.out.println();
       inorderBST(tree);
}
	

public static Node deleteNode(Node tree,int num){
	if(tree==null)
	{
		return null;
	}
	if(tree.key==num)
	{
		getAndDeleteNextLowest(tree);
	}
	
	if(tree.key<num)
		deleteNode(tree.right, num);
	else
		deleteNode(tree.left, num);
	
	return tree;
}

private static void getAndDeleteNextLowest(Node tree) {

}


public static void inorderBST(Node temp){
	if(temp==null)
		return;
	
	inorderBST(temp.left);
	System.out.println(temp.key);
	inorderBST(temp.right);
	
}

public static Node insert(Node temp,int num){
	if(temp==null){
		return new Node(num);
	}
	
	
	if(num<temp.key)
	temp.left=insert(temp.left, num);
	else
	temp.right=insert(temp.right, num);
	
	return temp;
}
public static boolean searchBST(int num,Node temp){
	
	if(temp==null)
		return false;
	
	if(temp.key==num)
		return true;
	
	if(temp.key<num)
	{
		return searchBST(num, temp.right);
	}else{
		return searchBST(num, temp.left);
	}
}


}
 class Node{
	 int key;
	 Node left;
	 Node right;
	 Node(int key){
		 this.key=key;
	 }
 }