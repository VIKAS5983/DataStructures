import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class printRightView {
public static void main(String args[]){
	  Node root = new Node(1, new Node(2, new Node(4), new Node(5)), new Node(3, new Node(6), new Node(7)));

	  int num=1;
	  printRightview(root,num);
}

private static int printRightview(Node root, int num) {
	Queue<Node> q=new LinkedList<Node>();
	q.peek();
	q.add(root);
	q.add(null);
	while(!q.isEmpty()){
		Node n1=q.remove();
		if(n1!=null)
		{
		Node r1=n1.getRight();
		Node l1=n1.getLeft();
		if(r1!=null)
		q.add(r1);
		if(l1!=null)
		q.add(l1);
		}
		if(q.size()==1)
			break;
		
		if(n1==null){
		System.out.println(q.peek().getData());
		q.add(null);
		}

	}
	
	return num;
}

}
