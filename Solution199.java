public class Solution extends VersionControl {
    public int firstBadVersion(int n)
    {
        int start=1;
        int end=n;
        int tem=0,mid=0;
        while(start<=end)
        {
           mid=start+(end-start)/2;
           if(isBadVersion(mid))
           {
               end=mid-1;
               tem=mid;
           }
           else
           {
               start=mid+1;
           }
        }
       return tem;    
    }
}
