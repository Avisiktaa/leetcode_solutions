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
    public int gcd(int a,int b)
    {
        if(b==0)
        return a;
        return gcd(b,a%b);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode num1=head;
        ListNode num2=num1.next;
        while(num2!=null)
        {
            int gcdvalue=gcd(num1.val,num2.val);
            ListNode value=new ListNode(gcdvalue);
            value.next=num2;
            num1.next=value;
            
            num1=num2;
            num2=num2.next;
        }
        return head;
    }
}