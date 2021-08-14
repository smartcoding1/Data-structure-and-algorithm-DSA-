class MergeInterval {
    class MyComparator implements Comparator<int []>{
        public int compare(int[]a,int[]b){
          return a[0]-b[0];
        }
    }
        
    public int[][] merge(int[][] intervals){ 
          
    Arrays.sort(intervals, new MyComparator()); 
     ArrayList<ArrayList<Integer>> main=new ArrayList<>();
    int first=intervals[0][0];
    int sec= intervals[0][1];
    for(int i=1;i<intervals.length;i++)
    {
        if(sec>=intervals[i][0])
            sec=Math.max(sec,intervals[i][1]);
        else{
            
            ArrayList<Integer> list=new ArrayList<Integer>(); 
            list.add(first);
            list.add(sec);
            main.add(list);
            first=intervals[i][0];
            sec=intervals[i][1];
       }
    }
ArrayList<Integer> mlist=new ArrayList<Integer>(); 
            mlist.add(first);
            mlist.add(sec);
            main.add(mlist);       
   int[][] ans=new int[main.size()][];  
        
        
   int index=0;      
   for(ArrayList<Integer> list: main){
       
     int[] temp=new int[2];
     temp[0]=list.get(0);
     temp[1]=list.get(1);
     ans[index]=temp; 
     index+=1; 
       
   } 
        
   return ans;     
        
  }  
    
}
