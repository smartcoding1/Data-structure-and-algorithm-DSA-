class Solution {
    public int sumBase(int n, int k)
    {
        StringBuilder sb= new StringBuilder();
        int rem=Integer.MAX_VALUE;
        while(n!=0)
        {
         rem=n%k;
         sb.append(rem);
         n=n/k;
        }
        sb.reverse();
        int ans= Integer.parseInt(sb.toString());
        int sum=0;
        while(ans!=0)
        {
            sum+=ans%10;
            ans/=10;
        }
        return sum;
    }
}
