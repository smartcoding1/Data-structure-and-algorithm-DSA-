class Solution {
    public void deleteNode(ListNode node)
    {
      ListNode tem=node;
      ListNode tem2=tem;
        while(tem.next!=null)
        {
            tem.val=tem.next.val;
            tem2=tem;
            tem=tem.next;
        }
         tem2.next=null;
    }
}
