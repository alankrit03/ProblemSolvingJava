package problemSolvingJava;

public class RemoveNthNodeFromBackOfLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        while(n!=0) {
        	fast = fast.next;
        	n--;
        }
        if(fast==null)
        	return head.next;
        
        ListNode slow=head;
        
        while(fast.next!=null) {
        	slow = slow.next;
        	fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }

}
