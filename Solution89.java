class Solution {
   public int countBalls(int lowLimit, int highLimit) {
        int []arr= new int[46];
        int digit= lowLimit;
        int id=0;
        int max=1;
        while(digit!=0)
        {
            id+=digit%10;
            digit/=10;
        }
        ++arr[id];
        for(int i=lowLimit+1;i<=highLimit;i++)
        {
             digit=i;
            while(digit%10==0)
            {
                id-=9;
                digit/=10;
            }
            ++arr[++id];
            max=Math.max(max,arr[id]);
        }
        return max;
        
   }
}
