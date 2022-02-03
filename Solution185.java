class Solution {
    public ListNode removeElements(ListNode head, int val) 
    {  
        if(head==null)
            return head;
      
        ListNode pre=head;
        ListNode curr=head;
        while(curr!=null)
        {   
           
            if(pre.val==val&& curr.val==val)
            {
                pre=pre.next;
                curr=curr.next;
                head=pre;
            }
            else if(curr.val==val){
                pre.next=curr.next;
                curr=curr.next;}
            else{
                pre=curr;
                curr=curr.next;
            }
        }
        
        return head;
    }
}
