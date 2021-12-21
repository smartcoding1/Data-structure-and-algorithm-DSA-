class Solution {
    public int binaryGap(int n) 
    {
      StringBuilder sb= new StringBuilder();
        while(n!=0)
        {
            int rem=0;
                rem=n%2;
                n/=2;
              sb.append(rem);
        }
        char[] ans=(sb.reverse().toString().toCharArray());
        System.out.print(Arrays.toString(ans));
        List<Integer> index= new ArrayList<>();
        for(int i=0;i<ans.length;i++)
        {
            if(ans[i]=='1')
                index.add(i);
        }
        if(index.size()==1)
            return 0;
        int fans=0;
        for(int i=0;i<index.size()-1;i++)
        {
            fans=Math.max((index.get(i+1)-index.get(i)),fans);
            
        }
        return fans;
    }
}  
