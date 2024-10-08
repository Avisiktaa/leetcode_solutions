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
    public ListNode modifiedList(int[] nums, ListNode head) {
        
        HashSet<Integer> list=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            list.add(nums[i]);
        }
        while(head!=null && list.contains(head.val))
        {
            head=head.next;
        }
        ListNode temp=head;
        ListNode pre=head;
        while(temp!=null)
        {
            if(list.contains(temp.val))
            {
                pre.next=temp.next;
                temp=temp.next;
            }
            else{
            pre=temp;
            temp=temp.next;
        }
        }
        return head;
    }
}