class Solution {
    public int distributeCandies(int[] candyType) 
    {
        HashSet<Integer> set=new HashSet<>();
        for(int ele:candyType)
            set.add(ele);
        int n=candyType.length/2;
        System.out.println(set);
        Iterator<Integer> it=set.iterator();
        int count=0;
        for(int ele:set)
        {
            count++;
            if(count==n)
                return count;
        }
        return count;
    }
