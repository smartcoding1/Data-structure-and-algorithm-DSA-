class Solution {
   /*  class Short implements Comparator<int[]>
    {
        public int compare(int[] a,int[] b)
        {
            return b[1]-a[1];
        }
    }*/
    public int maximumUnits(int[][] boxTypes, int truckSize) 
    { 
        Arrays.sort(boxTypes,(x,y)->y[1]-x[1]);
        for(int i=0;i<boxTypes.length;i++)
        {
            for(int j=0;j<boxTypes[0].length;j++)
            {
                System.out.print(boxTypes[i][j]);
            }
        }
        int maxunit=0;
        for(int i=0;i<boxTypes.length;i++)
        {   
            if(truckSize>=boxTypes[i][0])
            {
             maxunit+=(boxTypes[i][0])*boxTypes[i][1];
             truckSize-=boxTypes[i][0];
            }
            else
            {
                maxunit+=truckSize*boxTypes[i][1];
                break;
            }
        }
        
        return maxunit;
    }
}
