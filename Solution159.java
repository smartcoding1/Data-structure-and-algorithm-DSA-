class Solution {
    public int canBeTypedWords(String text, String brokenLetters) 
    {
       String[] arr= text.split(" ");
       HashSet<Character> bset= new HashSet<>();
       for(int i=0;i<brokenLetters.length();i++)
           bset.add(brokenLetters.charAt(i));
         // System.out.println(bset);
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            String s= arr[i];
           // System.out.println(s);
            boolean flag=true;
            for(int j=0;j<s.length();j++)
            {
                if(bset.contains(s.charAt(j))){
                flag=false;
                break;}
            }
            if(flag)
            count++;
            
        }
        return count;
    }
}
