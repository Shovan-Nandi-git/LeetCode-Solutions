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
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode head1=head;
        head=head.next;
        head1.next=null;
        
        
        while(head!=null){
            ListNode next=head.next;
            ListNode head2=head;
            head2.next=null;
            if(head2.val<=head1.val){
                head2.next=head1;
                head1=head2;
            }
            else{
                ListNode head3=head1;
                while(head3.next != null && head3.next.val < head2.val){
                    head3 = head3.next;
                }
                ListNode temp=head3.next;
                head3.next=head2;
                head2.next=temp;
            }
            
            head=next;
        }
        return head1;
    }
}