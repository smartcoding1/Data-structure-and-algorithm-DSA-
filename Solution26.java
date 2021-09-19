class Solution {
    public boolean isPerfectSquare(int num) 
    {   
        long nums=(long)num;
        long st=0,en=num;
        long mid=0;
        while(st<=en)
        {
        mid=(st+en)/2;
        long result=mid*mid;
        if(result==num)
            return true;
        else if(result>num)
        {
            en=mid-1;
        }
        else
            st=mid+1;
        
        } 
        return false;
        
    }
}
