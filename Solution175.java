class Solution
{
    public ListNode reverseList(ListNode head)
    {
        ListNode pre=null;
        ListNode curr=head;
        ListNode next;
        while(curr!=null)
        {   
            next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;
        }
        return pre;
    }
}
