
public class MyLinkedList
{
	private static class node
	{
		 int data;
		 node next;
		 
		 node(int data)
		 {
			 this.data = data;
		 }
	}

node head;
node tail;

MyLinkedList() 
{
}

	MyLinkedList(int data)
	{
	 node n1 = new node(data);
	 this.head = n1;
	 this.tail = n1;
	}


// introduces loop of given length at the end of the list.
	public void introduceLoop(int length)
	{
		 if (this.head == null)
		 {
		    System.out.println("Empty List. Loop can not be inserted");
		    return;
		 }
	 
		 node p1 = this.head, p2 = this.head;
	 
		 int count = 0;
		 while (count < length)
		 {
		    if (p2 == null) 
		    {
		      System.out.println("Incorrect length of the loop given");
		      break;
		    }
		    p2 = p2.next;
		    count++;
		 }
	 
		 node prevP2 = null;
		 while (p2 != null)
		 {
		    prevP2 = p2;
		    p2 = p2.next;
		    p1 = p1.next;
		 }
	 
		 
		 prevP2.next = p1;
	 	System.out.println("Loop of length " + length + " added starting at node " + p1.data);
	}
  
// finds the node in the list where the loop starts
public node findLoopStart()
 {
	node slw=this.head;
	node fast=slw;
	
	while(fast!=null){
		slw=slw.next;
		fast=fast.next.next;
		System.out.println(slw.data);
		System.out.println(fast.data);
		if(slw==fast)
		break;

	}
	
	if(fast!=null)
	{
		System.out.println("Loop exists");
		slw=this.head;
		System.out.println(slw.data);
		System.out.println(fast.data);
		while(slw!=fast){
			slw=slw.next;
			fast=fast.next;
			System.out.println(fast.data);
		}
	}
	
	return slw;
	
 }
  

public void addNode_Tail(int data)
{
 // if we have an empty list, create a new list and copy its head and tail into 
	 // current object
	 if (this.head == null)
	 {
	    MyLinkedList l_temp = (new MyLinkedList(data));
	    this.head = l_temp.head;
	    this.tail = l_temp.tail;
	    return;
	 }
	 
	 // we need to add this node 'n' to the end of the list
	 node n = new node(data);
	 
	 node current = this.head, prev = null;
	 
	 while (current != null)
	 {
	    prev = current;
	    current = current.next;
	 }
	 
	 prev.next = n;
	 this.tail = n; // update the tail info as well
}
  
  
public static void main(String[] args)
{
	 MyLinkedList list = new MyLinkedList();
	 
	 // 9->1->2->3->4
	 list.addNode_Tail(9);
	 list.addNode_Tail(1);
	 list.addNode_Tail(2);
	 list.addNode_Tail(3);
	 list.addNode_Tail(4);
	
	 // introduce loop of length 3 at the end of the above list
	 // the loop would start at node 2
	 list.introduceLoop(3);
	 
	 // find where the loop starts
	 int data = list.findLoopStart().data;
	 System.out.print("\nloop detected starting at node "+data);
	}
}
 