

public class Main
{
    static public void swap(int ar[],int i, int j ){
        int temp=0;
        temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
        
    }
    static public void setalternate(int ar[],int n){
        for(int i=1;i<n;i+=2){
            if(ar[i-1]<ar[i])
                swap(ar,i-1,i);
            if(i+1<n && ar[i+1]<ar[i]) 
                swap(ar,i+1,i);
        }
    }
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int ar[]={1,2,3,4,5,6,7,8,9};
		setalternate(ar,ar.length);
		for(int i=0;i<ar.length;i++){
		    System.out.print(ar[i]+" ");
		}
	}
}
