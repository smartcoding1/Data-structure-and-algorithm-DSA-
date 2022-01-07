class Solution {
    public int[] decrypt(int[] code, int k)
    { 
        int n=code.length;
        int[] arr= new int[code.length];
        if(k==0)
         return arr;
        for(int i=0;i<arr.length;i++)
        {
            
             if(k>0)
            {
                int sum=0;
                for(int j=i+1;j<=i+k;j++)
                {
                    if(j<n)sum+=code[j];
                    else sum+=code[j-n];
                }
                 arr[i]=sum;
            }
            else
            {
                int sum=0;
                for(int j=i-1;j>=i+k;j--)
                {
                    if(j>=0)sum+=code[j];
                    else sum+=code[j+n];
                }
                arr[i]=sum;
            }
            
        }
        return arr;
    }
}
