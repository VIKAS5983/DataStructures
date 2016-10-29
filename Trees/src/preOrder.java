import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class preOrder {

	public static void main(String args[]){
		  Node root = new Node(1, new Node(2, new Node(4), new Node(5)), new Node(3, new Node(6), new Node(7)));
  
		 // printIterativePostOrder(root);
		  System.out.println(height(root,0));
		  System.out.println(maxHeight);
	}
	public static int maxHeight=0; 
	
	
	 int treeHeight(Node node) 
	    {
	        // Base Case
	        if (node == null)
	            return 0;
	  
	        // Create an empty queue for level order tarversal
	        Queue<Node> q = new LinkedList();
	  
	        // Enqueue Root and initialize height
	        q.add(node);
	        int height = 0;
	  
	        while (1 == 1) 
	        {
	            // nodeCount (queue size) indicates number of nodes
	            // at current lelvel.
	            int nodeCount = q.size();
	            if (nodeCount == 0)
	                return height;
	            height++;
	  
	            // Dequeue all nodes of current level and Enqueue all
	            // nodes of next level
	            while (nodeCount > 0) 
	            {
	                Node newnode = q.peek();
	                q.remove();
	                if (newnode.getLeft() != null)
	                    q.add(newnode.getLeft());
	                if (newnode.getRight() != null)
	                    q.add(newnode.getRight());
	                nodeCount--;
	            }
	        }
	    }
	public static boolean height(Node root,int num){
		if(num>maxHeight){
			maxHeight=num;
		}
			
		if(root==null)
			return false;
	
		
		return height(root.getLeft(),num+1)|| height(root.getRight(), num+1);
	}
	
	
	public static int size(Node root){
		if(root==null)
		{
			return 0;
		}
		return size(root.getLeft())+size(root.getRight())+1;
	}
	
	public static void printIterativePreOrder(Node root){
		Stack<Node> st=new Stack<Node>();
		st.add(root);
		
		while(!st.isEmpty())
		{
		
				Node temp=st.pop();
				if(temp.getRight()!=null)
				st.push(temp.getRight());
				if(temp.getLeft()!=null)
				st.push(temp.getLeft());
				System.out.println(temp.getData());
				
		}
	}
	
	public static void printIterativePostOrder(Node root){
		Stack<Node> st=new Stack<Node>();
		st.add(root);
		
		while(!st.isEmpty())
		{
		
				Node temp=st.pop();
				if(temp.getLeft()!=null)
				st.push(temp.getLeft());
				if(temp.getRight()!=null)
				st.push(temp.getRight());

				System.out.println(temp.getData());
				
		}
	}

	
	public static void printPreOrder(Node root){
		if(root==null){
			return;
		}
	System.out.println(root.getData());
	printPreOrder(root.getLeft());
	printPreOrder(root.getRight());
		return;
	}
	
	public static void printPostOrder(Node root){
		if(root==null){
			return;
		}
		printPostOrder(root.getRight());
	System.out.println(root.getData());
	printPostOrder(root.getLeft());

		return;
	}
	
	public static void printInOrder(Node root){
		if(root==null){
			return;
		}
		printInOrder(root.getLeft());
	System.out.println(root.getData());
	printInOrder(root.getRight());

		return;
	}
	
	}
