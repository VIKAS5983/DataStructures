import java.util.Stack;

public class minimumReversals {

	public static void main(String args[]){
		String str="}}{{";
		
		Stack<Character> st=new Stack<Character>();
		
		for(int i=0;i<str.length();i++){
			
			if(str.charAt(i)=='}' && !st.isEmpty() && st.peek()=='{')
				st.pop();
			else	
			st.push(str.charAt(i));
			
		}
		
		System.out.println(st);
		int temp=0;
		while(!st.empty()){
			char n=st.pop();
			if(!st.empty() && st.peek()==n)
				{
				st.pop();
				}
			temp++;
		}
		
		System.out.println(temp);
	}
}
