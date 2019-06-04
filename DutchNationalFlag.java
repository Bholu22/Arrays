
import java.util.*;

public class DutchNationalFlag{
	static void dutchSort(int arr[]){
		int low=0,mid=0,temp=0;
		int high=arr.length-1;
		while(mid<=high){
			switch(arr[mid])
			{
				case 0:          temp=arr[low];
						 arr[low]=arr[mid];
						 arr[mid]=temp;
						 low++;
						 mid++;
						 break;
				
				case 1:          mid++;
					         break;
						 
				case 2:          temp=arr[mid];
						 arr[mid]=arr[high];
						 arr[high]=temp;
						 high--;
						  break;	
			}
		}
		
	}
	public static void main(String args[]){
		//int arr[]={0,1,0,0,1,2,1,2,2,1,0,1,2};
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number elements to enter: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array elements: ");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}		
			
		
		dutchSort(arr);
		System.out.println("Array after sorting is: ");
		for(int i=0;i<=arr.length-1;i++){
			System.out.print(arr[i]+" ");
		}
		
	}
}
