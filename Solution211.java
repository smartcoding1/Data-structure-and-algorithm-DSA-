class Solution {
    public List<String> buildArray(int[] target, int n) 
    {
        ArrayList<String> list= new ArrayList<>();
        int[] ans= new int[target.length];
        int count=1;
        for(int i=0;i<target.length;i++)    
        {
            list.add("Push");
            ans[i]=count++;
            if(ans[i]!=target[i]){
                list.add("Pop");
                i--;
            }
        }
        return list;
    }
}
