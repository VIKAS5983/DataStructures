import java.util.Stack;

public class sortStackUsingRecursion {

	public static void main(String args[]){
		
		Stack<Integer> st=new Stack<Integer>();
		st.push(10);
		st.push(9);
		st.push(81);
		st.push(70);
		st.push(16);
		st.push(53);
		st.push(44);
		st.push(31);
	
		System.out.println(st);
	
	for(int i=0;i<st.size();i++)
		{
			sortStack(st,i,st.pop());
		}		
	
		System.out.println(st);
	}
	
	

	public static void sortStack(Stack<Integer> st,int k,int item){
		if(st.size()==k)
		{
			//st.push(item);
			Stack<Integer> temp=new Stack<Integer>();
			while(!st.empty() && st.peek()>=item){
			temp.push(st.pop());	
			}
			st.push(item);
			
			while(!temp.empty()){
				st.push(temp.pop());
			}
			return;
		}
		Integer num=st.pop();
		sortStack(st,k,item);
		
		st.push(num);
		
		return;
	}
}
