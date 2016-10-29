import java.util.Stack;

public class evaluatePostFixExpression {

	public static void main(String args[]){
		String exp="231*+9-";
		 char[] ch = exp.toString().toCharArray();
		 
		 Stack<Character> st=new Stack<Character>();
		 for(int i=0;i<exp.length();i++)
			 {
			 
			
			 
			 if(Character.isDigit(ch[i]))
			 {
				 st.push(ch[i]);
			 }else{
				 System.out.println(st.pop()+""+ ch[i]+st.pop());
				 st.push('c');
			 }
			 
			 }
	}
}
