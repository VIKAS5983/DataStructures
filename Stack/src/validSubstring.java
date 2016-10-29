import java.util.Stack;

public class validSubstring {

	public static void main(String args[]){
		String str=")()())";
		
		Stack<Character> st=new Stack<Character>();
		
		int tempSize=0;
		int max=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(!st.isEmpty() && st.peek()=='(')
			{
				if(tempSize>max){
					
				}
			}else if(!st.empty() && st.peek()==')'){
				st.push(str.charAt(i));
			}else{
				st.push(str.charAt(i));
			}
			
			
		}
		
		
	}
}
