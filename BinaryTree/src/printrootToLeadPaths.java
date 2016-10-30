
public class printrootToLeadPaths {
	
	public static void main(String args[]){
		   Node tree= new Node(10);
	       tree.left = new Node(8);
	       tree.right = new Node(2);
	       tree.left.left = new Node(3);
	       tree.left.right = new Node(5);
	       tree.right.left = new Node(2);
	       printTreesPaths(tree,"");
	 
	System.out.println("apa");
	}
	
	public static void printTreesPaths(Node n1,String temp){
		if(n1==null)
			return;
		if(n1.left==null  && n1.right==null )
		{
			System.out.println(temp+" "+n1.key);
			return;
		}

		
		temp=temp+" "+n1.key;
		printTreesPaths(n1.left, temp);
		
		printTreesPaths(n1.right, temp);
		
		return ;	
	}
	
}
