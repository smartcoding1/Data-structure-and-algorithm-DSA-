class Solution {
    public int lengthOfLastWord(String s)
    {
        String[] word=s.split(" ");
        int n=word.length-1;
        String ans=word[n];
        return ans.length();
    }
}
