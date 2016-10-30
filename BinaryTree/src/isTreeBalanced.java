
public class isTreeBalanced {
public static void main(String args[]){
	   Node tree= new Node(50);
       tree.left = new Node(7);
       tree.right = new Node(2);
       tree.left.left = new Node(3);
       tree.left.right = new Node(5);
       tree.left.left.left = new Node(3);

      System.out.println("Tree balance status is "+TreeBalance(tree));
 }

public static boolean TreeBalance(Node n1){
	if(n1==null)
		return true;
	
	if(Math.abs((height(n1.left)-height(n1.right)))<=1)
		return TreeBalance(n1.left) && TreeBalance(n1.right);
	else
		return false;
	
}

public static int height(Node temp){
	
	if(temp==null)
		return 0;
	
	return Math.max(height(temp.left), height(temp.right))+1;
}

}
