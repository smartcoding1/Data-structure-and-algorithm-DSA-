class Solution {
    public String[] findOcurrences(String text, String first, String second) 
    {
       String[] arr=text.split(" ");
       ArrayList<String> list= new ArrayList<>();
       for(int i=0;i<arr.length-1;i++)
       {
           if(arr[i].equals(first) && arr[i+1].equals(second) && i+2<arr.length)
               list.add(arr[i+2]);
       }
        String[] ans= new String[list.size()];
        int idx=0;
        for(String ele:list)
           ans[idx++]=ele;
        
        return ans;
        
    }
}
