class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2)
    {
        
        ListNode head= new ListNode();
        if(list1==null)
            return list2;
        else if(list2==null)
            return list1;
        if(list1.val<list2.val)
        {
            head=list1;
            list1=list1.next;
        }
        else
        {
            head=list2;
            list2=list2.next;
        }
        ListNode ans=head;
        while(list1!=null && list2!=null)
        {
            if(list1.val<list2.val)
            {
                head.next=list1;
                head=head.next;
                list1=list1.next;
            }
            else
            {
                head.next=list2;
                head=head.next;
                list2=list2.next;
            }
        }
        if(list1!=null)
            head.next=list1;
        else
            head.next=list2;
        
        return ans;
    }
}
