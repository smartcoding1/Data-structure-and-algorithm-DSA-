class Solution {
    public int[][] merge(int[][] intervals) {
      Pair[] arr= new Pair[intervals.length];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=new Pair(intervals[i][0],intervals[i][1]);
        }
      Arrays.sort(arr);
      Stack<Pair> st= new Stack<>();
      for(int i=0;i<arr.length;i++)
      {
          if(i==0)
              st.push(arr[i]);
          else
          {
              Pair tem=st.peek();
              if(tem.end>=arr[i].st)
                  tem.end=Math.max(tem.end,arr[i].end);
              else
                  st.push(arr[i]);
          }
      }
        Stack<Pair> res= new Stack<>();
        while(!st.isEmpty())
        {
            res.push(st.pop());
        }
        int[][] ans=new int[res.size()][2];
        int idx=0;
        while(!res.isEmpty())
        {
            Pair p=res.pop();
            ans[idx][0]=p.st;
            ans[idx][1]=p.end;
            idx++;
        }
        return ans;
    }
    
 public class Pair implements Comparable<Pair>
 {
  int st;
  int end;
    Pair(int a,int b)
    {
        this.st=a;
        this.end=b;
    }
     public int compareTo(Pair other)
     {
         if(this.st!=other.st)
             return this.st-other.st;
         else
             return this.end-other.end;
     }
 }
}
