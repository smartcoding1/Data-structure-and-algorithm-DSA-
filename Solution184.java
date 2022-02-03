public class Solution {
    public boolean hasCycle(ListNode head) 
    {
      HashSet<ListNode> set= new HashSet<>();
      ListNode tem=head;
        if(head==null)
            return false;
      while(tem.next!=null)
      {
           set.add(tem);
            tem=tem.next;
            if(set.contains(tem))
            return true;
      }
       
        return false;
        
    }
}
