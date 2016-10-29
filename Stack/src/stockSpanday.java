import java.util.Stack;

public class stockSpanday {

	public static void main(String args[]){
		
	int arr[]={100, 80, 60, 70, 60, 75, 85};
	
	Stack<Integer> st=new Stack<Integer>();
	
	for(int i=0;i<arr.length;i++)
	{
		int temp=1;
		if(!st.isEmpty())
		{
			Stack<Integer> t=new Stack<Integer>();
			
			while(st.peek()<arr[i]){
				t.push(st.pop());
				temp++;
			}
			
			while(!t.isEmpty()){
				st.push(t.pop());
			}
		}
		
		st.push(arr[i]);
		
		System.out.print(temp+" ");
			
	
	}
	
	
	}
	
	
}
