
public class printPathsFromRootToLeaf {
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
	String st="";
	printPaths(n1,st);
}
	public static void printPaths(Node n,String st){
		if(n==null)
		{
			return ;
		}
		if(n.left==null && n.right==null)
		{
			System.out.println(st+" "+n.key);

		}
		String st1=st+" "+n.key;
		
		printPaths(n.left, st1);
		printPaths(n.right, st1);
		
		return;
	}
	
}
