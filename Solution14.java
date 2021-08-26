class Solution14 {
    public int[] intersection(int[] nums1, int[] nums2)
    {  
       HashSet<Integer> set= new HashSet<>();
       HashSet<Integer> ans= new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            set.add(nums1[i]);
        }
        for(int j=0;j<nums2.length;j++)
        {
            if(set.contains(nums2[j]))
                ans.add(nums2[j]);
        }
       int [] arr= new int[ans.size()];
        int idx=0;
        for(int a:ans){
          arr[idx++]=a;  
        }
        
       return arr; 
    }    
}
