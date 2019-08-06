#include<bits/stdc++.h>
using namespace std;
void rearrange(int arr[],int n){
	int small=0,large=n-1;
	int temp[n];
	int flag=true;
	for(int i=0;i<n;i++){
		if(flag)
			temp[i]=arr[large--];
		else
			temp[i]=arr[small++];
		flag=!flag;		
	}
	for(int i=0;i<n;i++){
		arr[i]=temp[i];
	}
	
}
int main(){
	int arr[]={1,2,3,4,5,6,7};
	int n=sizeof(arr)/sizeof(arr[0]);
	rearrange(arr,n);
	for(int i=0;i<n;i++){
		cout<<arr[i]<<" ";
	}
	
}

