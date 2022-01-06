class Solution {
    HashMap<Integer,Integer> map= new HashMap<>();
  public class MyComparator implements Comparator<Integer>
    {
        public int compare(Integer a, Integer b)
        {
            if(map.get(a)==map.get(b))
                return b-a;
            else
                return map.get(a)-map.get(b);
        }
    }
    public int[] frequencySort(int[] nums) 
    {
      
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {   
            list.add(nums[i]);
            if(map.containsKey(nums[i]))
            {
                int n=map.get(nums[i]);
                n++;
                map.put(nums[i],n);
            }
            else
            {
                map.put(nums[i],1);
            }
        }
        Collections.sort(list,new MyComparator());
        int count=0;
        int [] arr= new int[list.size()];
        for(int ele:list)
        {
            arr[count++]=ele;
        }
         return arr;
    }
}
