
public class LinkedList {
    Node head;
     
    // Add a new node to the front of the linked list
    public void addToFront(int data) {
        Node n = new Node(data);
        n.next = head;
        head = n;
    }
     
    // Print list elements
    public void printList() {
        Node tmp = head;
        while(tmp != null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }
     
    // Merge 2 sorted lists to form a single sorted list
    public void mergeList(LinkedList list) {
         Node n1=this.head;;
         Node n2=list.head;
         Node temp=null;
         if(n1==null)
         {
        	 this.head=list.head;
        	 return;
         }
         if(n2==null)
         {
        	 return;
         }
         if(n1.data <n2.data)
         {   	
         temp=n1;
         n1=n1.next;
         }
         else{
        	 temp=n2;
        	 n2=n2.next;
         }
         head=temp;
         
         while(n1!=null && n2!=null){
             if(n1.data <n2.data)
            	 {
            	 temp.next=n1;
             	 n1=n1.next;
            	 }
             else{
            	 temp.next=n2;
            	 n2=n2.next;
             }
             temp=temp.next;
        	 
         }
         
         if(n1==null)
         {
        	 temp.next=n2;
         }else{
        	 temp.next=n1;
         }
         
         return;
    }
     
    public static void main(String[] args) {
    	LinkedList list1 = new LinkedList();
        list1.addToFront(9);
        list1.addToFront(8);
        list1.addToFront(6);
        list1.addToFront(5);
        list1.addToFront(4);
        list1.addToFront(2);
 
        LinkedList list2 = new LinkedList();
        list2.addToFront(7);
        list2.addToFront(3);
        list2.addToFront(1);
 
     /*   list1.mergeList(list2);
        System.out.println("Merged List:");
        list1.printList();*/
        
        // recursivereverseLinkedList(list1.head).next=null;
  
      //  list1.head=iterativereverseLinkedList(list1.head);
      
       /* Node temp=list1.head;
        while(temp!=null){
        	System.out.print(temp.data+"->");
        	temp=temp.next;
        			
        }*/
        
    }
public static Node head1=null;
	
	private Node reverseKNodes(Node start, int k) {
		
		if (start == null || k < 2) {
			return null;
		}
		
			Node prev = null;
			Node curr = start;
			Node next = null;
			 
			 int i = 1;
			 while (curr.next != null && i < k) {
				 next = curr.next;
				 curr.next = prev;
				 prev = curr;
				 curr = next;
				 i++;
			  }
		 next = curr.next;
		  curr.next = prev;
		  return curr;
	  }

private static Node iterativereverseLinkedList(Node node1) {
	Node temp=node1;
	if(node1==null)
		return null;
	Node tempNext=temp.next;
	Node tempPrev=null;
	while(tempNext!=null){
		temp.next=tempPrev;
		tempPrev=temp;
		temp=tempNext;
		tempNext=temp.next;
	}
temp.next=tempPrev;
	return temp;
	
}

	private static Node recursivereverseLinkedList(Node node1) {
		if(node1.next==null)
		{
			head1=node1;
			return node1;
		}
		Node temp=recursivereverseLinkedList(node1.next);
		temp.next=node1;
		
		return node1;
		
	}
}