class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n)
    {
         if(head.next==null){
             head=null;
             return head;}
         int count=0;
         ListNode tem=head;
        while(tem!=null)
        {
            count++;
            tem=tem.next;
        }
        System.out.println(count);
        int k=count-n;
        if(n==count)
        {
            head=head.next;
            return head;
        }
        int count1=0;
        ListNode tem2=head;
        while(count1!=k-1)
        {   
            count1++;
            tem2=tem2.next;
        }
        tem2.next=tem2.next.next;
        return head;
    }
}
