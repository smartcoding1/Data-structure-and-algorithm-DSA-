class Solution10 {
    public String sortSentence(String s) 
    {
        String tem[]=s.split(" ");
        String ans[]= new String[tem.length];
        StringBuilder sb=new StringBuilder();
        
        for(String ele:tem)
        {
            int i=ele.charAt(ele.length()-1)-'0';
            ans[i-1]=ele.substring(0,ele.length()-1);
        }
        
        for(int i=0;i<ans.length-1;i++)
        {
            sb.append(ans[i]);
            sb.append(" ");
                
        }sb.append(ans[ans.length-1]);
       
        return sb.toString();
        
    }
}
