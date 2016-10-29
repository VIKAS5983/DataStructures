import java.util.Stack;

public class Inorder {

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
		inorderTraversalWithStack(n1);
		System.out.println();
		inorderWithRecursion(n1);
		System.out.println();
		inorderWithoutStackAndRecursion(n1);
}

public static void inorderWithoutStackAndRecursion(Node n){
	
}
public static void inorderWithRecursion(Node n){
	if(n==null)
		return;
	
	inorderWithRecursion(n.left);
	System.out.print(n.key+" ");
	inorderWithRecursion(n.right);
	
	return;
}

public static void inorderTraversalWithStack(Node n){
	Stack<Node> st=new Stack<Node>();
	
	st.add(n);
	
	
		Node temp=n;
		
		while(temp.left!=null){
			st.push(temp.left);
			temp=temp.left;
		}
		
		while(!st.isEmpty()){
			
		Node t=st.pop();
		System.out.print(t.key+" ");
		if(t.right!=null)
		{
				st.push(t.right);
				temp=t.right;
				while(temp.left!=null){
					st.push(temp.left);
					temp=temp.left;
				}
				
		}

		}
}
}
