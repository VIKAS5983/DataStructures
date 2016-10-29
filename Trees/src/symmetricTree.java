import java.util.Stack;

public class symmetricTree {
public static void main (String args[]){
	
	  Node root = new Node(0, new Node(1, new Node(4), new Node(5,new Node(7),new Node(8))), new Node(2, new Node(3), new Node(6,new Node(9),null)));

System.out.println(" Is the tree symmetric ");
spiralPrint(root);
}

public static void  spiralPrint(Node root){
	Stack<Node> lStack=new Stack<Node>();
	Stack<Node> rStack=new Stack<Node>();
	rStack.push(root);
	boolean flag=true;
	while(!lStack.isEmpty() || !rStack.isEmpty()){
		if(flag){
			Node temp=rStack.pop();
			System.out.println(temp.getData()+" ");
			if(temp.getRight()!=null)
			lStack.push(temp.getRight());

			if(temp.getLeft()!=null)
			lStack.push(temp.getLeft());
			
			if(rStack.isEmpty())
				flag=false;
		}else{
			Node temp=lStack.pop();
			System.out.println(temp.getData()+" ");
			if(temp.getLeft()!=null)
			rStack.push(temp.getLeft());
			if(temp.getRight()!=null)
			rStack.push(temp.getRight());

			if(lStack.isEmpty())
				flag=true;
		}
		
	}
}


public static boolean isSymetric(Node l,Node r){
	if(l==null&& r==null)
		return true;
	else if(l==null && r==null){
		return false;
	}
	
		
	return l.getData()==r.getData()&& isSymetric(l.getLeft(),r.getRight()) && isSymetric(l.getRight(), r.getLeft());
}
}
