/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
      ListNode merge=new ListNode();
      ListNode temp=merge;
      ListNode head1=list1;
      ListNode head2=list2;
      while(head1!=null && head2!=null)
      {
        if(head1.val>=head2.val)
        {
            temp.next=head2;
            head2=head2.next;
        }
        else
        {
            temp.next=head1;
            head1=head1.next;
        }
        temp=temp.next;
      } 
      while(head1!=null)
      {
        temp.next=head1;
        head1=head1.next;
        temp=temp.next;
      }
       while(head2!=null)
      {
        temp.next=head2;
        head2=head2.next;
        temp=temp.next;
      }
      return merge.next;
    }  
}