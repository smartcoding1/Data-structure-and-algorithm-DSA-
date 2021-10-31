class Solution {
    public int[] countBits(int n) 
    {
        int arr[]=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            int count=0;
            int j=i;
            while(j!=0)
            {
                j=j^(j&(-j));
                count++;
            }
            arr[i]=count;
        }
        return arr;
    }
}
