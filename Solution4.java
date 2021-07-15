class Solution4{
    public int fib(int n) {
        int a[]=new int[n+2];
        a[0]=0;
        a[1]=1;
        for(int i=2;i<n+2;i++)
        {
            a[i]=a[i-1]+a[i-2];
        }
      return a[n];
    }
}
