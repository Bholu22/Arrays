public class Main
{
    public static void swap(int ar[],int i,int j){
        int temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
    }
    public static void sort(int ar[],int n){
        for(int i=1;i<n;i+=2)
        {
            if(ar[i-1]>ar[i])
                swap(ar,i-1,i);
            if(i+1<n && ar[i+1]>ar[i])
                swap(ar,i+1,i);
        }
    }
	public static void main(String[] args) {
	    int ar[]={1,2,3,4,5,6,7,8,9};
	    sort(ar,ar.length);
	    for(int i=0;i<ar.length;i++){
	        System.out.print(ar[i]+" ");
	    }
	    
	}
}
