class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold)
    {
       int i=0,j=0,sum=0;
       int count=0;
        int avg=0;
        while(j<arr.length)
        {
            if(j<k-1)
            {
              sum+=arr[j];
                j++;                    
            }
            else if(j==k-1)
            {
                sum+=arr[j];
                avg=sum/k;
                if(avg>=threshold)
                    count++;
                j++;
            }
            else
            {
                sum-=arr[i];
                i++;
                sum+=arr[j];
                avg=sum/k;
                if(avg>=threshold)
                    count++;
                j++;
            }
        }
        return count;
    }
}
