import java.util.Stack;

public class nextGreaterElement {

	public static void main(String args[]){
		
		int num[]={11, 13, 21, 3};
		Stack<Integer> st=new Stack<Integer>();
		for(int i=num.length-1;i>=0;i--)
			{
			
				boolean flag=true;
				while(!st.empty() && st.peek()<num[i]){
					st.pop();
					flag=false;
				}
				
				if(st.empty())
					System.out.println(-1);
				else{
					System.out.println(st.peek());
				}
				
				st.push(num[i]);
			}
	}
}

