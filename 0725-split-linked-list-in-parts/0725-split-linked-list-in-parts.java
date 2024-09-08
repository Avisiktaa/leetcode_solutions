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
    public ListNode[] splitListToParts(ListNode head, int k) {
       int n=0;
       ListNode[] ans=new ListNode[k];
       ListNode temp=head;
       while(temp!=null)
       {
        n++;
        temp=temp.next;
       } 
       int size=n/k;
       int extra=n%k;
       ListNode current=head;
       for(int i=0;i<k;i++)
       {
        ans[i]=current;
        int eachsize=size+(extra>0?1:0);
        extra--;

        for(int j=1;j<eachsize && current!=null;j++)
        {
            current=current.next;
        }
        if(current!=null)
        {
            ListNode nxtnode=current.next;
            current.next=null;
            current=nxtnode;
        }
       }
       return ans;
    }
}