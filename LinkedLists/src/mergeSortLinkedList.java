
public class mergeSortLinkedList {
	   static Node head;
	   
	    static class Node {
	 
	        int data;
	        Node next;
	 
	        Node(int d) {
	            data = d;
	            next = null;
	        }
	    }
	    
  void printList(Node node) {
	        while (node != null) {
	            System.out.print(node.data + " ");
	            node = node.next;
	        }
	    }
	   
    public static void main(String[] args) {
    	mergeSortLinkedList list = new mergeSortLinkedList();
        list.head = new Node(10);
        list.head.next = new Node(12);
        list.head.next.next = new Node(11);
        list.head.next.next.next = new Node(11);
        list.head.next.next.next.next = new Node(12);
        list.head.next.next.next.next.next = new Node(11);
        list.head.next.next.next.next.next.next = new Node(10);
 
        System.out.println("Linked List before removing duplicates ");
        list.printList(head);
 
        list.remove_duplicates();
        System.out.println("");
        System.out.println("Linked List after removing duplicates");
        list.printList(head);
 
    }

	private void remove_duplicates() {

		merSortList();
		
		Node n1=head;
		while(n1.next!=null){
			Node temp=n1.next;
			while(temp.next!=null && temp.data==n1.data){
				temp=temp.next;
			}
			n1.next=temp;
			n1=n1.next;
		}
	}
	
	private void merSortList(){
		Node firsthead=head;
		Node firstmid=null;
		Node slow=null;
		Node fast=null;
		slow=firsthead;
		fast=firsthead;
		while(fast!=null&& fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
		}
		firstmid=slow.next;
		slow.next=null;
		merSortListUtil(firsthead, firstmid);
		
		
	}
	
	private Node merSortListUtil(Node list1,Node list2){

		if(list1==null|| list2==null)
			{
			if(list1!=null)
			return list1;
			
			return list2;
			}	
		System.out.println("first mid"+ list1.data);
		System.out.println("secon mid"+ list2.data);

			
		Node firsthead=list1;
		Node firstmid=null;
		Node slow=null;
		Node fast=null;
		Node secondhead=list2;
		Node secondmid=null;
		slow=firsthead;
		fast=firsthead;
		while(fast!=null&& fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
		}
		
		firstmid=slow.next;
		slow.next=null;
		
		slow=secondhead;
		fast=secondhead;
		while(fast!=null&& fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
		}
		secondmid=slow.next;
		slow.next=null;
		
		

		Node headFirst=merSortListUtil(firsthead, firstmid);
		Node headSecond=merSortListUtil(secondhead, secondmid);
		
		Node head=mergelists(headFirst, headSecond);
		
		return head;
	}
	
    public static Node mergelists(Node list1,Node list2){
    	
    	Node n1=list1;
    	Node n2=list2;
    	Node fin=null;
    	if(n1.data >n2.data)
    		{
    		fin=n1;
    		n1=n1.next;
    		}
    	else{
    		fin=n2;
    		n2=n2.next;
    	}
    	Node temp=fin;
    	while(n1!=null && n2!=null){
    	
    		if(n1.data>n2.data)
    		{
    			temp.next=n1;
    			temp=temp.next;
    			n1=n1.next;
    		//	System.out.println(n1.data);
    		}else{
    			temp.next=n2;
    			temp=temp.next;
    			n2=n2.next;
    		//	System.out.println(n2.data);
    		}
    	}
    	
    	if(n1==null){
    		temp.next=n2;
    	}else{
    		temp.next=n1;
    	}
    	
    	return fin;
    }
    
    private void printLinkList(Node startNode) {
    	  Node temp = startNode;
    	  while(temp!=null){
    	   System.out.print(temp.data + " ");
    	   temp = temp.next;
    	  }
    	 }
}

 

