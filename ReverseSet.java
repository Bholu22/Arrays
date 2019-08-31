import java.util.*;
public class ReverseSet{
	static public void reverse(int ar[],int n,int k){
		for(int i=0;i<n;i+=k){
			int left=i;
			int right=Math.min(i+k-1,n-1);
			int temp;
			while(left<right){
				temp=ar[left];
				ar[left]=ar[right];
				ar[right]=temp;
				left+=1;
				right-=1;
			}
		}
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array: ");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter elements of Array: ");
		for(int i=0;i<n;i++){
			ar[i]=sc.nextInt();
		}
		System.out.println("Enter size of set: ");
		int k=sc.nextInt();
		reverse(ar,n,k);
		System.out.println("Array after doing reverse : ");
		for(int i=0;i<n;i++){
			System.out.print(ar[i]+" "); 
		}
		
	}
}