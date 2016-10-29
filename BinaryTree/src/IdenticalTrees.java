
public class IdenticalTrees {
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
		
		Node n2=new Node(1);
		n2.left=new Node(2);
		n2.right=new Node(3);
		n2.left.left=new Node(4);
		n2.left.right=new Node(5);
		n2.right.right=new Node(6);
		n2.left.left.right=new Node(7);
		n2.left.left.right.left=new Node(11);
		n1.left.left.right.left.left=new Node(13);

	System.out.println("Identical Trees status  "+IdenticalTrees(n1,n2));
		//System.out.println("size is "+ size(n1));
}



public static boolean IdenticalTrees(Node n1,Node n2) {
	// TODO Auto-generated constructor stub
	
	if(n1!=null && n2!=null &&  n1.key==n2.key)
	{
		return IdenticalTrees(n1.left, n2.left) && IdenticalTrees(n1.right, n2.right);
	}
	
	if(n1==null && n2==null)
		return true;
	return false;
}

public static int size(Node head){
	if(head==null)
		return 0;
	
	return 1+size(head.left)+size(head.right);
}
	
}
