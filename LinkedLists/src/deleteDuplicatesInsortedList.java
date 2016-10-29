	
public class deleteDuplicatesInsortedList {
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
 
    /* Function to print linked list */
     void printList()
     {
         Node temp = head;
         while (temp != null)
         {
            System.out.print(temp.data+" ");
            temp = temp.next;
         }  
         System.out.println();
     }
 
     /* Drier program to test above functions */
    public static void main(String args[])
    {
    	deleteDuplicatesInsortedList llist = new deleteDuplicatesInsortedList();
        llist.push(20);
        llist.push(13);
        llist.push(13);
        llist.push(11);
        llist.push(11);
        llist.push(11);
         
        /*System.out.println("List before removal of duplicates");
        llist.printList();
         
        llist.removeDuplicates();
         
        System.out.println("List after removal of elements");*/
        llist.printList();
        
        llist.printReverseList(llist.head);
    }
    private void printReverseList(Node head){
    	if(head==null)
    		return ;
    	printReverseList(head.next);
    	System.out.println(head.data);
    	return;
    }

	private void removeDuplicates() {
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
} 

