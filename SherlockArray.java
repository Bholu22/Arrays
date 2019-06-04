public class SherlockArray{
	static boolean ifsumequal(int arr[],int n){
		int i=0;
		int j=n-1,sum=0;
		while(i!=j){
			if(sum>=0){
				sum-=arr[j];
				j--;
			}
			else{
				sum+=arr[i];
				i++;
			}
		}
		return sum==0?true:false;
	}
	public static void main(String args[]){
		int arr[]={1,2,3,3};
		int n=arr.length;
		if(ifsumequal(arr,n)){
			System.out.println("Such element exists!!!");
		}
		else
			System.out.println("Such element does not exists!!! ");
	}
}