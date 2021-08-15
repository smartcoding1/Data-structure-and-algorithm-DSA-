class Solution11 {
    public int countConsistentStrings(String allowed, String[] words) 
    {   int count=0;
        for(String ans:words)
        {
            for(int i=0;i<ans.length();i++)
            {
                if(!allowed.contains(ans.charAt(i)+""))
                    break;
                if(i==ans.length()-1)
                    count++;
            }
        } return count;
    }
}
