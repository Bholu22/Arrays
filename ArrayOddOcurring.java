import java.util.Arrays;
public class ArrayOddOcurring{
	    int returnodd(int ar[],int n){
			//if(ar.length%2!=0){
			int res=0;
			for(int i=0;i<n;i++){
				res=res^ar[i];
			}
			return res;
			//}
			//else
			//return 0;
		}
	
	public static void main(String arg[]){
		int ar[]={2,2,2,3,4,5,3,4,5,3};
		Arrays.sort(ar);
		int i;
		int n=ar.length;
		ArrayOddOcurring abhi=new  ArrayOddOcurring();
		int result=abhi.returnodd(ar,n);
		/*System.out.println("Final result after shifting all zeroes!!!");
		 for(i=0; i<n ;i++){
		      System.out.print(ar[i] + " ");
		   } */
        System.out.println(result);
	}
}