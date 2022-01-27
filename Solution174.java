class Solution {
    public int getDecimalValue(ListNode head) 
    {
        ListNode tem= head;
        int count=0;
        while(tem.next!=null)
        {
            count++;
            tem=tem.next;
        }
        int ans=0;
        ListNode node=head;
        while(node.next!=null)
        {
            ans+=node.val*Math.pow(2,count);
             node=node.next;
             count--;
            System.out.println(count);
        }
        ans+=node.val*Math.pow(2,count);
        return ans;
    }
}
