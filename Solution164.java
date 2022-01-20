class Solution {
    public String[] findWords(String[] words)
    {
         HashSet<Character> set1=new HashSet<>();
         HashSet<Character> set2=new HashSet<>();
         HashSet<Character> set3=new HashSet<>();
         ArrayList<String> list= new ArrayList<>();
         String s1="qwertyuiopQWERTYUIOP";
         String s2="asdfghjklASDFGHJKL";
         String s3="zxcvbnmZXCVBNM";
         for(int i=0;i<s1.length();i++)
             set1.add(s1.charAt(i));
         for(int i=0;i<s2.length();i++)
             set2.add(s2.charAt(i));
         for(int i=0;i<s3.length();i++)
             set3.add(s3.charAt(i));
         for(int i=0;i<words.length;i++)
         {
              String ans= words[i];
              boolean flag1=false,flag2=false,flag3=false;
              boolean row1=true,row2=true,row3=true;
                if(set1.contains(ans.charAt(0)))
                    flag1=true;
                  else if(set2.contains(ans.charAt(0)))
                      flag2=true;
                  else
                      flag3=true;
             if(flag1)
             {
                 for(int j=1;j<ans.length();j++)
                 {
                     if(!set1.contains(ans.charAt(j))){
                         row1=false;
                         break;}
                 }
                 if(row1==true)
                     list.add(ans);
             }
              if(flag2)
             {
                 for(int j=1;j<ans.length();j++)
                 {
                     if(!set2.contains(ans.charAt(j))){
                         row2=false;
                         break;}
                 }
                 if(row2==true)
                     list.add(ans);
             }
              if(flag3)
             {
                 for(int j=1;j<ans.length();j++)
                 {
                     if(!set3.contains(ans.charAt(j))){
                         row3=false;
                         break;}
                 }
                 if(row3==true)
                     list.add(ans);
             }
              
         }
        String [] arr= new String[list.size()];
        int count=0;
        for(String ele:list)
            arr[count++]=ele;
        
       // System.out.println(set1);
        return arr;
    }
}
