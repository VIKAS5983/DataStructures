
public class IntersectionOfTwoLinkedLists {
    static Node head1, head2;
    
    static class Node {
 
        int data;
        Node next;
 
        Node(int d) {
            data = d;
            next = null;
        }
    }
    
    
    public static void main(String[] args) {
    	IntersectionOfTwoLinkedLists list = new IntersectionOfTwoLinkedLists();
 
        // creating first linked list
        list.head1 = new Node(3);
        list.head1.next = new Node(6);
        list.head1.next.next = new Node(9);
        list.head1.next.next.next = new Node(15);
        list.head1.next.next.next.next = new Node(30);
 
        // creating second linked list
        list.head2 = new Node(10);
        list.head2.next = new Node(15);
        list.head2.next.next = new Node(30);
 
        System.out.println("The node of intersection is " + list.getNode());
 
    }


	private int getNode() {
		int diff=length(head1)-length(head2);
		Node temp=null;
		Node temp2=null;

		if(diff>0)
		{
			System.out.println(diff);
			temp=head1;
			temp2=head2;
			while(diff!=0)
				{
				temp=temp.next;
				System.out.println("node is"+temp.data+" ");
				diff--;
				}
		}else{
			 temp=head2;
			temp2=head1;
			while(diff!=0)
				{
				temp=temp.next;
				diff++;
				}			
		}
		
		while(temp!=temp2){
			temp=temp.next;
			temp2=temp2.next;
			System.out.println("In while "+temp.data+ " " +temp2.data);
		}

		//System.out.println(temp.data);
		return temp.data;
	}
	private int length(Node n1){
		int num=0;
		while(n1!=null){
			num++;
			n1=n1.next;	
		}
		return num;
	}
}
