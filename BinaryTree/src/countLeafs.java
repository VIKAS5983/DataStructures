
public class countLeafs {
	public static void main(String args[]){
		Node n1=new Node(1);
		n1.left=new Node(2);
		n1.right=new Node(3);
		n1.left.left=new Node(4);
		n1.left.right=new Node(5);
	/*	n1.right.right=new Node(6);
		n1.left.left.right=new Node(7);
		n1.left.left.right.left=new Node(10);
		n1.left.left.right.right=new Node(11);
		n1.left.left.right.left.left=new Node(13);*/
		System.out.println(countLeafs1(n1));
	}

	private static int countLeafs1(Node n1) {
		if(n1==null)
			return 0;
		
		if(n1.left==null && n1.right==null)
			return 1;
		
		
			
		return countLeafs1(n1.left)+countLeafs1(n1.right);
	}
	
	
}
