
public class mergeSortedList {
	 Node head;  // head of list
	  
	    /* Linked list Node*/
	    class Node
	    {
	        int data;
	        Node next;
	        Node(int d) {data = d; next = null; }
	    }
	  
	    /* Inserts a new Node at front of the list. */
	    public void push(int new_data)
	    {
	        /* 1 & 2: Allocate the Node &
	                  Put in the data*/
	        Node new_node = new Node(new_data);
	  
	        /* 3. Make next of new Node as head */
	        new_node.next = head;
	  
	        /* 4. Move the head to point to new Node */
	        head = new_node;
	    }
	    
	    public static void main(String args[]){
	    	mergeSortedList list1=new mergeSortedList();
	    	list1.push(1);
	    	list1.push(3);
	    	list1.push(5);
	    	list1.push(7);
	    	list1.push(9);
	    	
	    	mergeSortedList list2=new mergeSortedList();
	    	list2.push(2);
	    	list2.push(6);
	    	list2.push(8);
	    	list2.push(15);
	    	
	    	Node n1=mergelists(list1,list2);
	    	
	    	while(n1!=null){
	    		System.out.print(n1.data+" ");
	    		n1=n1.next;
	    	}
	    }
	    
	    public static Node mergelists(mergeSortedList list1,mergeSortedList list2){
	    	
	    	Node n1=list1.head;
	    	Node n2=list2.head;
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
}
