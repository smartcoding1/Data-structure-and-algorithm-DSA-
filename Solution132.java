class Solution {
    public boolean hasAlternatingBits(int n) 
    { 
      StringBuilder sb= new StringBuilder();
        int rem=0;
      while(n!=0)
      {
          rem=n%2;
          n/=2;
          sb.append(rem);
      }
      char[] arr=(sb.reverse().toString().toCharArray()); 
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
                return false;
        }
        return true;
        
       
    }
}
