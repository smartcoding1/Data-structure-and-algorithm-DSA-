class Solution {
    public boolean detectCapitalUse(String word) 
    {
        char[] arr=word.toCharArray();
        boolean flag1=false,flag2=false,flag3=false;
        if(arr.length==1)
            return true;
        else if(Character.isUpperCase(arr[0])&&Character.isLowerCase(arr[1]))
           flag3=true;
        else if(Character.isUpperCase(arr[0]))
            flag1=true;
        else
            flag2=true;
       
        if(flag3)
           {
               for(int i=2;i<arr.length;i++)
               {
                   if(!Character.isLowerCase(arr[i]))
                       return false;
               }
              
           }   
              
        if(flag1)
           {
               for(int i=1;i<arr.length;i++)
               {
                   if(!Character.isUpperCase(arr[i]))
                   {
                       return false;
                   }   
               }
               
           }
            
        if(flag2)
           {
               for(int i=1;i<arr.length;i++)
               {
                   if(!Character.isLowerCase(arr[i]))
                       return false;
               }
               
           }
                
        
        return true;
    }
}
