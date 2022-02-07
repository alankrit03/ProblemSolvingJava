package problemSolvingJava;

public class DetectCycleInLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public boolean hasCycle(ListNode head) {
    	ListNode fast=head,slow=head;
    	while(fast!=null && fast.next!=null) {
    		
    		fast = fast.next.next;
    		slow=slow.next;
            if(fast==slow)
    			return true;
    	}
    	return false;
    }
}
