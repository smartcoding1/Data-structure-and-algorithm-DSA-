class Solution {
    public int divisorSubstrings(int num, int k)
    {
        int i=0,j=0,count=0;
        String s=Integer.toString(num);
        while(j<s.length())
        {
          if(j<k-1)
          {
              j++;
          }
            else
            {
                String tem=s.substring(i,j+1);
                int ans=Integer.parseInt(tem);
                if(ans>0 && num%ans==0)
                    count++;
                i++;
                j++;
            }
            
        }
        return count;
        
    }
}
