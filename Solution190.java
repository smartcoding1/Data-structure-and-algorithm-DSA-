class Solution {
    public int maxScore(String s) {
        char[] arr=s.toCharArray();
        int precount=0;
        for(int i=0;i<arr.length;i++)
        {
          if(arr[i]=='1')
          {
              precount+=1;
              
          }
        }
        System.out.println(precount);
        int ans=Integer.MIN_VALUE,sum=0;
        int zerocount=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]=='0')
            {
                zerocount+=1;
                sum=zerocount+precount;
                ans=Math.max(sum,ans);
            }
            else{
                precount=precount-1;
                sum=zerocount+precount;
                ans=Math.max(sum,ans);
            }
            
        }
        return ans;
    }  
}
