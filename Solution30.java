class Solution {
    public boolean checkIfPangram(String sentence)
    {
        int arr[]= new int[26];
        for(int i=0;i<sentence.length();i++)
        {
            char ch=sentence.charAt(i);
            arr[ch-'a']=1;
        }
        for(int ele:arr)
        {
            if(ele!=1)
                return false;
        }
      return true;
    }  
}
