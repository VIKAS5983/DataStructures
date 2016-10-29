import java.util.HashSet;
import java.util.Iterator;

public class intersectionAndUnion {
	static class Node {
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}

	public static Node head;
	public static Node head2;
	public static void main(String args[]){
			head=new Node(1);
			head.next=new Node(23);
			head.next.next=new Node(20);
			head.next.next.next=new Node(14);
			head.next.next.next.next=new Node(7);
			head.next.next.next.next.next=new Node(18);
			head.next.next.next.next.next.next=new Node(19);
			head2=new Node(23);
			head2.next=new Node(10);
			head2.next.next=new Node(20);
			head2.next.next.next=new Node(15);
			head2.next.next.next.next=new Node(19);
			interSectionOfLinkedList(head,head2);

			unionOfLinkedList(head,head2);

	}
	
	
	private static void unionOfLinkedList(Node temp,Node temp2) {
		// TODO Auto-generated method stub
		HashSet<Integer> h=new  HashSet<Integer>();

		while(temp!=null){
		if(!h.contains(temp.data))
		{
			h.add(temp.data);
		}
		temp=temp.next;
		}
		
		while(temp2!=null){
			if(!h.contains(temp2.data))
			{
				h.add(temp2.data);

			}
			temp2=temp2.next;
		}
		
		Iterator<Integer> i=h.iterator();
		
		
		while(i.hasNext()){
			System.out.print(i.next()+"  ");
			
		}
		return;
		
	}
	private static void interSectionOfLinkedList(Node temp,Node temp2) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				HashSet<Integer> h=new  HashSet<Integer>();

				while(temp!=null){
				if(!h.contains(temp.data))
				{
					h.add(temp.data);
				}
				temp=temp.next;
				}
				
				while(temp2!=null){
					if(h.contains(temp2.data))
					{
						System.out.println(temp2.data+" ");

					}
					temp2=temp2.next;
				}
		return ;
	}
}
