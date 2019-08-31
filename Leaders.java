public class Main
{
   /* brute force
   static public void leaders(int ar[],int n){
        int i,j=0;
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(ar[i]<ar[j])
                {
                    break;
                }
            }
            if(j==n){
                System.out.print(ar[i]+" ");
            }
        }
    }*/
    static public void leaders(int ar[],int n){
        int max_right=ar[n-1];
        for(int i=n-2;i>=0;i--){
            if(max_right<ar[i]){
                max_right=ar[i];
                 System.out.print(max_right+" ");
            }
           
        }
    }
	public static void main(String[] args) {
	int ar[]={2,4,55,4,6,8,50,40,1};
	int n=ar.length;
	leaders(ar,n);
	}
}
