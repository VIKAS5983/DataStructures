
public class convertingbinaryTreeToMirrorTree {

public static void main(String args[]){
		
		Node n1=new Node(1);
		n1.left=new Node(2);
		n1.right=new Node(3);
		n1.left.left=new Node(4);
		n1.left.right=new Node(5);
		n1.right.right=new Node(6);
		n1.left.left.right=new Node(7);
		n1.left.left.right.left=new Node(10);
		n1.left.left.right.right=new Node(11);
		n1.left.left.right.left.left=new Node(13);
		inorderWithRecursion(n1);
		mirrorrize(n1);
		System.out.println();
		inorderWithRecursion(n1);
		
}

public static void mirrorrize(Node n){
	if(n==null)
		return;
		mirrorrize(n.left);
		mirrorrize(n.right);
	Node temp=n.left;
	n.left=n.right;
	n.right=temp;
	
	return;
	
}
	
public static void inorderWithRecursion(Node n){
	if(n==null)
		return;
	
	inorderWithRecursion(n.left);
	System.out.print(n.key+" ");
	inorderWithRecursion(n.right);
	
	return;
}

}
