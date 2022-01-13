class Solution {
    public int canBeTypedWords(String text, String br) {
        String ar[]=text.split(" ");
        int c=0,j=0;
        while(j<ar.length)
            {
        for(int i=0;i<br.length();i++)
        {
            char ch=br.charAt(i);
            
                if(ar[j].contains(ch+""))
                {
                    c++;

                    break;
                }
                    
            }
                 j++;
        }
        return ar.length-c;
        
    }
}
