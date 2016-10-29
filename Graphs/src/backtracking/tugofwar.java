package backtracking;

public class tugofwar {
	
	public static void main(String args[]){
	    int arr[] = {23, 45, -34, 12, 0, 98, -99, 4, 189, -1, 4};
	    int n=arr.length;
	    
	    tugOfWar(arr, n);
	    return ;
	}
	
public static void TOWUtil(int[] arr, int n, boolean[] curr_elements, int no_of_selected_elements,
            boolean[] soln, int[] min_diff, int sum, int curr_sum, int curr_position)
{
   // checks whether the it is going out of bound
   if (curr_position == n)
       return;

   // checks that the numbers of elements left are not less than the
   // number of elements required to form the solution
   if ((n/2 - no_of_selected_elements) > (n - curr_position))
       return;

   // consider the cases when current element is not included in the solution
   TOWUtil(arr, n, curr_elements, no_of_selected_elements,
             soln, min_diff, sum, curr_sum, curr_position+1);

   // add the current element to the solution
   no_of_selected_elements++;
   curr_sum = curr_sum + arr[curr_position];
   curr_elements[curr_position] = true;

   // checks if a solution is formed
   if (no_of_selected_elements == n/2)
   {
       // checks if the solution formed is better than the best solution so far
       if (Math.abs(sum/2 - curr_sum) < min_diff[0])
       {
           min_diff[0] = Math.abs(sum/2 - curr_sum);
           for (int i = 0; i<n; i++)
               soln[i] = curr_elements[i];
       }
   }
   else
   {
       // consider the cases where current element is included in the solution
       TOWUtil(arr, n, curr_elements, no_of_selected_elements, soln,
                 min_diff, sum, curr_sum, curr_position+1);
   }

   // removes current element before returning to the caller of this function
   curr_elements[curr_position] = false;
}



static void tugOfWar(int[] arr, int n)
{
   // the boolen array that contains the inclusion and exclusion of an element
   // in current set. The number excluded automatically form the other set
   boolean[] curr_elements = new boolean[n];

   // The inclusion/exclusion array for final solution
   boolean[] soln = new boolean[n];

   int[] min_diff =new int[1];
   min_diff[0]= Integer.MAX_VALUE;

   int sum = 0;
   for (int i=0; i<n; i++)
   {
       sum += arr[i];
       curr_elements[i] =  soln[i] = false;
   }

   // Find the solution using recursive function TOWUtil()
   TOWUtil(arr, n, curr_elements, 0, soln, min_diff, sum, 0, 0);

   // Print the solution
//   cout <<;
   System.out.print( "The first subset is: ");
   for (int i=0; i<n; i++)
   {
       if (soln[i] == true)
           //cout << arr[i] << " ";
       System.out.print(arr[i]+" ");
   }
   //cout << "\n";
   System.out.println();
   System.out.print("\nThe second subset is: ");
   for (int i=0; i<n; i++)
   { 
       if (soln[i] == false)
           //cout << << " ";
       System.out.print(arr[i] +"  ");
   }
}
}
