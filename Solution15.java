class Solution15{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int arr[], int n){
        
        // Your code here
        int ans=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++)
        {   
            sum+=arr[i];
            ans= Math.max(ans,sum);
            if(sum<0)
            sum=0;
        }   
        return ans;
    }
    
}

