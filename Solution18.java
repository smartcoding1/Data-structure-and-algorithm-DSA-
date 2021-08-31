class Solution {
    public double myPow(double x, int n)
    {
        
        if(n==0)
            return 1;
        if(n==Integer.MIN_VALUE)
        {
            double a=myPow(x,n/2);
            return a*a;
        }
        if(n<0)
        {
            n=-n;
            x=1/x;
        }
        
        if(n%2==0)
        {   
            double a=myPow(x,n/2);
            return a*a;
        }
        else
        {  double a=myPow(x,n/2);
            return x*a*a;
        }
        
        }
