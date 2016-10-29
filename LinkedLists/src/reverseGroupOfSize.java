
public class reverseGroupOfSize {
	static Node head;

	static class Node{
	int data;
	Node next;
	Node(int d){
		this.data=d;
		this.next=null;
		}
	}
	
	public static void printList(Node n1){
		Node temp=n1;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		return;
	}

	public static void main(String args[]){
		reverseGroupOfSize list = new reverseGroupOfSize();

        list.head = new Node(10);
        list.head.next = new Node(12);
        list.head.next.next = new Node(13);
        list.head.next.next.next = new Node(14);
        list.head.next.next.next.next = new Node(15);
        list.head.next.next.next.next.next = new Node(16);
        list.head.next.next.next.next.next.next = new Node(17);
        list.head.next.next.next.next.next.next.next = new Node(18);
        list.head.next.next.next.next.next.next.next.next = new Node(19);
        list.head.next.next.next.next.next.next.next.next.next = new Node(20);
        list.head.next.next.next.next.next.next.next.next.next.next = new Node(21);
        printList(list.head);
        
        list.head=reverseLinkedListIngroup(list.head,4);
        System.out.println();
        printList(list.head);
        return;
	}
	
	public static Node reverseLinkedListIngroup(Node n1,int size)
	{
		if(n1==null)
			return null;
					
		Node nextList=null;
		Node first=n1;
		Node last=null;
		Node temp=first;
		Node prev=null;
		Node next=null;
		int num=0;
		while(num<size && temp!=null){
			num++;
			next=temp.next;
			temp.next=prev;
			prev=temp;
			temp=next;
		}
		last=prev;
		first.next=reverseLinkedListIngroup(temp, size);

		return last;
	}
}
