class Solution {
    public boolean areNumbersAscending(String s)
    {
      int prenum=0;
      String[] arr=s.split(" ");
        for(String ele:arr)
        {
            try
            {
              int num=Integer.parseInt(ele);
                  if(num>prenum)
                      prenum=num;
                  else
                      return false;
            }
            catch(NumberFormatException ex){}
            
        }
        return true;
    }
}
