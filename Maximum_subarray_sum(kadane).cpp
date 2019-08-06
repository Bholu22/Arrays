/*
Kadane’s Algorithm:

Initialize:
    max_so_far = 0
    max_ending_here = 0

Loop for each element of the array
  (a) max_ending_here = max_ending_here + a[i]
  (b) if(max_ending_here < 0)
            max_ending_here = 0
  (c) if(max_so_far < max_ending_here)
            max_so_far = max_ending_here
return max_so_far
*/
#include<bits/stdc++.h>
using namespace std;
int maxsubarraysum(int ar[],int n){
	int maxsum=INT_MIN,max_endshere=0;
	for(int i=0;i<n;i++){
		max_endshere=max_endshere+ar[i];
		if(maxsum<max_endshere)
			maxsum=max_endshere;	
		if(max_endshere<0)
			max_endshere=0;
	
		
	}
	return maxsum;
}
int main(){
	int n;
	cin>>n;
	int ar[n];
	for(int i=0;i<n;i++){
		cin>>ar[i];
	}
	int max=maxsubarraysum(ar,n);
	cout<<"Maximum subarraysum in the array:\t"<<max;
	return 0;
}


