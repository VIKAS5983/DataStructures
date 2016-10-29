
public class sorting {
public static void main(String args[]){
	 int arr[] = {64, 34, 25, 12, 22, 11, 90};
	 mergeSort(arr,0,arr.length);
	 for(int j=0;j<arr.length;j++)
	 System.out.println(arr[j]);
	 
}


static void  mergeSort(int arr[], int l, int r)
{
    if (l < r)
    {
        // Same as (l+r)/2, but avoids overflow for
        // large l and h
        int m = l+(r-l)/2;
 
        // Sort first and second halves
        mergeSort(arr, l, m);
        mergeSort(arr, m+1, r);
 
        merge(arr, l, m, r);
    }
}

private static void merge(int[] arr, int l, int m, int r) {

	 
}


public static void selectionSort(int[] arr){

	for(int i=0;i<arr.length;i++)
	{
		int min=i;
		for(int j=i;j<arr.length;j++)
		{
			if(arr[min]>arr[j])
			{
				min=j;
			}
		}
		int temp=arr[min];
		arr[min]=arr[i];
		arr[i]=temp;
	}
}

public static int[] insertionSort(int[] arr){
	for(int i=1;i<arr.length;i++)
	{
		int temp=arr[i];
		int j=i;
		for(j=i;j>0 && arr[j-1]>temp;j--)
		{
			
			arr[j]=arr[j-1];
			
		}
		arr[j]=temp;
	
		
	}
	
return arr;	
}

public static int[] bubbleSort(int[] arr){
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr.length-i-1;j++)
		{
			if(arr[j]>arr[j+1])
			{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	return arr;
}
}
