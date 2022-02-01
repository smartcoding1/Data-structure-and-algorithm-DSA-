class Solution {
    public ListNode deleteDuplicates(ListNode head)
    {  
        if(head==null || head.next==null)
            return head;
       ListNode pre=head;
       ListNode curr=head.next;
        while(curr!=null)
        {
            if(pre.val==curr.val)
            {
                ListNode tem=curr;
                pre.next=curr.next;
                tem=null;
                curr=curr.next;
            }
            else{
                pre=curr;
                curr=curr.next;
            }
        }
        return head;
    }
}
