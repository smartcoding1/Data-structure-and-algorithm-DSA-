class Solution {
    public int findComplement(int num)
    {
      int setbit=0;
        int j=0;
        while(setbit<num)
            
        {
            setbit+=Math.pow(2,j);
            j++;
        }
        return setbit-num;
    }
}  
   
