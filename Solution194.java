class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) 
    {
     Arrays.sort(arr);
     int min=Integer.MAX_VALUE;
     for(int i=0;i<arr.length-1;i++)
     min=Math.min(arr[i+1]-arr[i],min);
     List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i+1]-arr[i]==min)
            {
                List<Integer> list1= new ArrayList<>();
                list1.add(arr[i]);
                list1.add(arr[i+1]);
                ans.add(list1);
            }
        }
        
        return ans;
    }
}
