class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3)
    {
       ArrayList<Integer> list= new ArrayList<>();
       HashSet<Integer> set1= new HashSet<>();
        HashSet<Integer> set2= new HashSet<>();
        HashSet<Integer> set3= new HashSet<>();
       int[] arr= new int[101];
        for(int ele:nums1)
            set1.add(ele);
        for(int ele:set1)
            arr[ele]++;
        
        for(int ele:nums2)
            set2.add(ele);
        for(int ele:set2)
            arr[ele]++;
        
        for(int ele:nums3)
            set3.add(ele);
        for(int ele:set3)
            arr[ele]++;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=2)
                list.add(i);
        }
       
        return list;
    }
}
