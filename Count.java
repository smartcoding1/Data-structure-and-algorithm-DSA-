class Solution {
    public int countPrimes(int n) 
    {
       /* boolean[] isPrime= new boolean[1000001];
        ArrayList<Integer> a= new ArrayList<Integer>();
            int count=0;
        Arrays.fill(isPrime,true);
        isPrime[0]= false;
        isPrime[1]=false;
        for(int i=2;i<n;i++)
        {
            if(isPrime[i])
                a.add(i);
                for(int j=i;j<n;j+=i)
                    isPrime[j]=false;
        
        }
        
        return a.size();*/
        
        int count=0;
        boolean a[]=new  boolean[n];
        Arrays.fill(a,true);
        for(int i=2;i*i<=n;i++)
            if(a[i])
                for(int j=i*i;j<n;j+=i)
                    a[j]=false;
                    
       for(int i=2;i<a.length;i++)
       {
          if(a[i]==true)
               count++;}
        return count;
    }
}
