
public class DeleteGreaterNodesOnRight {
static class Node {
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
	}
}

public static Node head;
public static void main(String args[]){
		head=new Node(1);
		head.next=new Node(8);
		head.next.next=new Node(20);
		head.next.next.next=new Node(14);
		head.next.next.next.next=new Node(7);
		head.next.next.next.next.next=new Node(18);
		head.next.next.next.next.next.next=new Node(19);
		Node temp1=reverseLinkedList(head);
	Node temp=temp1;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		temp=temp1;
		System.out.println();
		deleteTheSmallerNodes(temp);
		
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
}
public static void deleteTheSmallerNodes(Node root){
	
	int max=Integer.MIN_VALUE;
	Node temp=root;
	Node prevTemp=null;
	while(temp!=null){
		
		if(max<temp.data)
		{
			max=temp.data;
		}
		if(max>temp.data){
			prevTemp.next=temp.next;
			System.out.println(temp.data);
			temp=prevTemp.next;
		}else{
		prevTemp=temp;
		temp=temp.next;
		}
	}
	return;
	
}

public static Node reverseLinkedList(Node root){
	
	if(root==null)
		return null;
	Node temp=root;
	Node prevtemp=null;
	Node temp2=null;
	while(temp!=null){
		temp2=temp.next;
		temp.next=prevtemp;
		prevtemp=temp;
		temp=temp2;
	}

	return prevtemp;
}

}
