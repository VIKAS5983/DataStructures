import java.util.Scanner;

public class addTwoLinkedListValues {

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String f=sc.nextLine();
		String s=sc.nextLine();
		String len[]=f.split(" ");
		String arr[]=s.split(" ");
		int num=0;
		for(int i=0;i<arr.length;i++)
		{
			int temp=Integer.parseInt(arr[i]);
			for(int j=i+1;j<arr.length;j++)
			{
				int temp2=Integer.parseInt(arr[j]);
				if(((temp+temp2)%Integer.parseInt(len[1]))==0)
				{
					num++;
					//System.out.println(temp+" "+ temp2);
				}
			}
		}
	System.out.println(num);
	}
	}
