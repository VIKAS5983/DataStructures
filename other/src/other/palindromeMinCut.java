package other;

import java.util.Stack;

public class palindromeMinCut {
public static void main(String args[]){
	String str="palindrome";
	Stack<Character> stc=new Stack<Character>();
	stc.push(str.charAt(0));
	int start=0;
	int end=0;
	
	for(int i=1;i< str.length();i++)
	{
		if(str.charAt(i)==stc.peek())
			{
			stc.push(str.charAt(i));
			
			}
	}
}
}
