class Solution {
    public ListNode middleNode(ListNode head) 
    {
        int count=1;
        ListNode tem=head;
        while(tem.next!=null)
        {
            count++;
            tem=tem.next;
        }
        if(count==1)
            return head;
        else
        {
         int mid=(count/2)+1;    
         int x=0;
        ListNode node=head;    
        while(x!=mid-1)
        {
            x++;
            node=node.next;
        }
        head=node;
        }
      return head;  
    }
}
