class Solution {
    public boolean canBeEqual(int[] target, int[] arr)
    { 
        int [] count= new int[1001];
        for(int ele:target)
        {
            count[ele]++;
        }
        for(int ele:arr)
        {
            count[ele]--;
        }
        for(int ele:count)
        {
            if(ele!=0)
                return false;
        }
        return true;
    }
}
