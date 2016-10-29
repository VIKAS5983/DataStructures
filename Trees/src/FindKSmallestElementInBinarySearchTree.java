import java.util.Stack;

public class FindKSmallestElementInBinarySearchTree {
 private Node rootNode;
 private static int counter;
  
 public static void main(String[] args) {
  new FindKSmallestElementInBinarySearchTree();
 }
 
 public FindKSmallestElementInBinarySearchTree() {
  addNode(rootNode, 40); 
  addNode(rootNode, 20); 
  addNode(rootNode, 60); 
  addNode(rootNode, 10); 
  addNode(rootNode, 30);
  addNode(rootNode, 50);
  addNode(rootNode, 70);
 
 System.out.println("Inorder traversal ");
 printInorderstack(rootNode);
 
 printTreeInOrder(rootNode);
 counter=10;
  Node kthSmallestNode = findKthSmallestItem(rootNode);
   
  if(kthSmallestNode!=null){
   System.out.println("\nElement is :"+kthSmallestNode.getData());
  }else{
   System.out.println("\nElement not found");
  }
 }
 private void printInorderstack(Node rootNode){
Stack<Node> n1=new Stack<Node>();
if(rootNode==null)
	return;
Node nod=rootNode;
n1.push(rootNode);
while(nod!=null){
	nod=n1.peek();
	nod=nod.getLeft();
	if(nod!=null)
	n1.push(nod);
}

while(n1.size()>0){
	Node temp=n1.pop();
	System.out.println(temp.getData()+"->");
	nod=temp.getRight();
	if(nod!=null)
	n1.push(nod);
	while(nod!=null){
		nod=n1.peek();
		nod=nod.getLeft();
		if(nod!=null)
		n1.push(nod);
	}
}

}
 private Node findKthSmallestItem(Node rootNode) {
	  if(rootNode==null){
		   return null;
		  }
		 	
	
			 
			Node nl= findKthSmallestItem(rootNode.getLeft());
			 counter--;
			  if(counter==0)
				 {
					 return rootNode;
				 }
			  if(nl!=null)
				  return nl;
			 Node nr=findKthSmallestItem(rootNode.getRight());
			  if(nr!=null)
				  return nr;
		 
		 return null;
 }
 private void printTreeInOrder(Node rootNode){
	 if(rootNode==null)
		 return;
	 printTreeInOrder(rootNode.getLeft());
	 System.out.print(rootNode.getData()+" -> ");
	 printTreeInOrder(rootNode.getRight());

 }
 
 private void addNode(Node rootNode, int data){

	if(rootNode==null)
	{	
	Node temp=new Node(data);
		this.rootNode=temp;
	}
	else{
	System.out.println("adding data "+ data);
	addNodeInProperPlace(rootNode, data);
	}
	return;
 }
  
 private void addNodeInProperPlace(Node rootNode, int data){ 

	 if(rootNode.getData()>data)
	 	{
		 if(rootNode.getLeft()!=null)
			 addNodeInProperPlace(rootNode.getLeft(), data);
		 else{
			 rootNode.setLeft(new Node(data));
		 }
	 	}else{
	 		if(rootNode.getRight()!=null)
	 			addNodeInProperPlace(rootNode.getRight(), data);
			 else{
				 rootNode.setRight(new Node(data));
	 		
	 	}
	
	 	}	 
 	}	 
}