class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums)
    {
        List<List<Integer>> ans= new ArrayList<>();
        
        Arrays.sort(nums);
        //int n=nums.length;
          for(int i=0;i<=nums.length-3;i++)
          {  
              int j=i+1;
              int n=nums.length;
          while(j<n-1){
              int p1=nums[i],p2=nums[j],p3=nums[n-1];
                if(p1+p2+p3==0){
                    List<Integer> arr =new ArrayList<>();
                    arr.add(p1);
                    arr.add(p2);
                    arr.add(p3);
                j++;
            if(!ans.contains(arr))
              ans.add(arr);
             // arr.clear();
               }
                if(p1+p2+p3>0)n--;
                if(p1+p2+p3<0) j++;
                
              } 
          } 
        return ans;
    }
                   
  
}
