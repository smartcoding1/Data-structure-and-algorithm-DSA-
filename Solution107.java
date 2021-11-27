class Solution {
    public int uniqueMorseRepresentations(String[] words)
    {
      String[] morse={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."}; 
       String[] ans=new String[words.length]; 
      for(int i=0;i<words.length;i++)
      {   
          StringBuilder sb= new StringBuilder();
          String s=words[i];
          for(int j=0;j<s.length();j++)
          {
              int tem=(int)s.charAt(j)-'a';
              sb.append(morse[tem]);
          }
          ans[i]=sb.toString();
      }
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<ans.length;i++)
        {
            if(!set.contains(ans[i]))
                set.add(ans[i]);
        }
        return set.size();
    }
}
