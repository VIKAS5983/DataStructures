import java.util.LinkedList;
import java.util.Queue;

public class checkCompleteBinaryTree {
	static class Node{
		public Node(int d){
			data=d;
		}
		int data;
		Node left;
		Node right;
	}
	
	static Node head;
	
	public static void main(String args[]){
		head=new Node(10);
		head.left=new Node(6);
		head.right=new Node(12);
		head.left.left=new Node(5);
		head.left.right=new Node(11);
		head.right.right=new Node(16);
		head.right.left=new Node(16);

		checkCompleteTree(head);	
	}

	private static void checkCompleteTree(Node head2) {
		
		Node h=head2;
		Queue<Node> q=new LinkedList<Node>();
		q.add(h);
		while(!q.isEmpty() && q.peek()!=null){
			Node temp=q.poll();
			q.add(temp.left);
			q.add(temp.right);
		}
		
		while(!q.isEmpty() && q.peek()==null)
		{
			q.poll();
		}
		
		if(q.isEmpty())
			System.out.println("Tree is complete");
		else
			System.out.println("Tree is not complete");
		
	}
	
}
