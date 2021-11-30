class Solution {
    public boolean halvesAreAlike(String s)
    {
        char[] arr= s.toCharArray();
     StringBuilder a= new StringBuilder();
     StringBuilder b= new StringBuilder();
         int count1=0,count2=0;
        for(int i=0;i<s.length()/2;i++)
            a.append(s.charAt(i));
        for(int j=s.length()/2;j<s.length();j++)
            b.append(s.charAt(j));
        for(int i=0;i<a.length();i++)
        {    
            char tem=a.charAt(i);
            if(tem=='a'||tem=='e'||tem=='i'||tem=='o'||tem=='u'||tem=='A'||tem=='E'||tem=='I'||tem=='O'||tem=='U')
                count1++;
        }
         for(int i=0;i<b.length();i++)
        {
             char tem=b.charAt(i);
            if(tem=='a'||tem=='e'||tem=='i'||tem=='o'||tem=='u'||tem=='A'||tem=='E'||tem=='I'||tem=='O'||tem=='U')
                count2++;
        }
        if(count1==count2)
            return true;
        else
            return false;
        
    }
}
