
public class deleteNodesFromLinkedList {
public static void main(String args[]){
	
	Nodes head=new Nodes(2);
	
	head.next=new Nodes(3);
	
	Nodes temp=head.next;
	temp.next=new Nodes(4);
	temp=temp.next;
	temp.next=new Nodes(5);
	temp=temp.next;
	temp.next=new Nodes(6);
	temp=temp.next;
	temp.next=new Nodes(7);
	
/*	Nodes n2=head;
	while(n2!=null){
		
		System.out.print(n2.data+" ");
		n2=n2.next;
	}*/
	Nodes n1=reverseLinkedList(head);
	
	while(n1!=null){
		
		System.out.print(n1.data+" ");
		n1=n1.next;
	}
}

private static void deleteNodesAfter(Nodes head,int data){
	Nodes n1=head;
	Nodes prev=null;
	while(n1!=null){
		n1=n1.next;
		if(data==n1.data)
			break;
		
		prev=n1;
	}
	
	prev.next=null;

}



private static Nodes reverseLinkedList(Nodes head){
	Nodes temp1=head;
	Nodes temp2=null;
	Nodes prev=null;
	temp1=head;
	
	while(temp1!=null){
		temp2=temp1.next;
		temp1.next=prev;
		prev=temp1;
		temp1=temp2;
		//System.out.println(temp1.data);
	}
	
	return prev;
}
}

class Nodes{
	int data;
	Nodes next;
	public Nodes(int d){
		data=d;
	}
}
