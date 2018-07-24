/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode subtract(ListNode A) {
        
        ListNode B = A;
        ListNode m = findMiddle(A);
        ListNode k = reverseList(m);
        ListNode l = k;
     
        while(l != m )
        {
            A.val = l.val - A.val;
     
            A = A.next;
            l = l.next;
        }
        reverseList(k);
        return B;
    }
    
    public ListNode findMiddle(ListNode A) {
        ListNode lastNode = A;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
            if(lastNode.next != null) {
                lastNode = lastNode.next;
                A = A.next;
            }
            else {
                return A;
            }
        }
        return A;
    }
    
    public ListNode reverseList(ListNode A) {
        ListNode b = A;
        ListNode c = null;
        ListNode a = null;
        
        while(b != null)
        {
            c = b.next;
            b.next = a;
            a = b;
            b = c;
        }
        return a;
    }
}
