class Solution {
    public boolean isPalindrome(ListNode head)
    {
      StringBuilder sb=new StringBuilder();
      StringBuilder sb2= new StringBuilder();
      ListNode tem=head;
        while(tem!=null)
        {
            sb.append(tem.val);
            tem=tem.next;
        }
        ListNode pre=null;
        ListNode curr=head;
        ListNode next=head.next;
        while(curr!=null)
        {   
            next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;
        }
        ListNode head1=pre;
        ListNode tem2=head1;
        while(tem2!=null)
        {
            sb2.append(tem2.val);
            tem2=tem2.next;
        }
        return sb.toString().equals(sb2.toString());
    }
}
