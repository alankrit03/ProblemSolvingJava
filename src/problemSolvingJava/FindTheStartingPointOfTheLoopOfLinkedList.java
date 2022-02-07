package problemSolvingJava;

public class FindTheStartingPointOfTheLoopOfLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public ListNode detectCycle(ListNode head) {    
    	ListNode ptr2 = isCyclePresent(head);
    	if(ptr2==null)
    		return ptr2;
    	
    	ListNode ptr1 = head;
    	while(ptr1!=ptr2) {
    		ptr1 = ptr1.next;
    		ptr2 = ptr2.next;
    	}
    	return ptr1;
    }
    
    public static ListNode isCyclePresent(ListNode head) {
    	ListNode slow, fast;
    	slow = fast = head;
    	while(fast!=null && fast.next!=null) {
    		fast = fast.next.next;
    		slow = slow.next;
    		if(slow==fast) {
    			return fast;
    		}
    	}
    	return null;
    }

}
