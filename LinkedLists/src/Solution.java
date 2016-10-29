import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
	public ArrayList<Integer> twoSum(final List<Integer> a, int b) {
	    ArrayList<Integer> indexes=new ArrayList<Integer>();
	    HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
	    int i=0;
	    for(i=0;i<a.size();i++)
	    {
	    	if(m.containsKey((b-a.get(i)))){
	    		break;
	    	}
	    	m.put(a.get(i), i+1);
	    	
	    }
	    if(i!=a.size())
	    {
	    	indexes.add(m.get(b-a.get(i)));
	    	indexes.add(i+1);
	    }
	    
	    return indexes;
	}
	
	public static void main(String args[]){
		
	}
}