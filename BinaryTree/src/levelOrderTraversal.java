import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class levelOrderTraversal {

	public static void main(String args[]){
		
		Node n1=new Node(1);
		n1.left=new Node(2);
		n1.right=new Node(3);
		n1.left.left=new Node(4);
		n1.left.right=new Node(5);
		n1.right.right=new Node(6);
		//n1.left.left.left=new Node(7);
	//	System.out.println(height(n1));
	//	levelOrder(n1);
		levelOrderSpiral(n1);
	}
	
	public static int height(Node head){
		if(head==null)
			return 0;
		
		return 1+Math.max(height(head.left),height(head.right));
	}
	
	public static void levelOrder(Node n1){
		
		Node head=n1;
		Queue<Node> q=new LinkedList<Node>();
		q.add(head);
		
		while(!q.isEmpty()){
			
			Node temp=q.remove();
			System.out.print(temp.key+" ");
			if(temp.left!=null)
			  q.add(temp.left);
			
			if(temp.right!=null)
			  q.add(temp.right);
		}
	}
	
	public static void levelOrderSpiral(Node n1){
		
		Stack<Node> q=new Stack<Node>();

		Stack<Node> q2=new Stack<Node>();
		q.add(n1);
		int flag=1;
		System.out.println(n1.key);

		while(!(q.isEmpty() && q2.isEmpty()))
		{
			if(flag==1){
				if(q.peek().left!=null)
				{
					q2.add(q.peek().left);
				}
				if(q.peek().right!=null)
				{
					q2.add(q.peek().right);
				}
				System.out.print(q.pop().key+" ");
				if(q.isEmpty())
					flag=0;
			}
			else
			{
				if(q2.peek().right!=null)
				{
					q.add(q2.peek().right);
				}
				if(q2.peek().left!=null)
				{
					q.add(q2.peek().left);
				}
				System.out.print(q2.pop().key+" ");
				
				if(q2.isEmpty())
					flag=1;
			}
		}
		
	}
}
