import java.util.Stack;

public class reverseStackUsingRecurssion {

	public static void main(String args[]){
		
		Stack<Integer> st=new Stack<Integer>();
		st.push(10);
		st.push(9);
		st.push(8);
		st.push(7);
		st.push(6);
		st.push(5);
		st.push(4);
		st.push(3);
		
		System.out.println(st);
		for(int i=0;i<st.size();i++)
		{
			recursiveMethod(st,i,st.pop());
		}		
		System.out.println(st);
	}
	
	public static void recursiveMethod(Stack<Integer> st,int k,int item){
		if(st.size()==k)
		{
			st.push(item);
			return;
		}
		Integer num=st.pop();
		recursiveMethod(st,k,item);
		
		st.push(num);
		
		return;
	}
}
