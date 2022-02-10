package problemSolvingJava;

public class RotateLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public ListNode rotateRight(ListNode head, int k) {
    	int len = getLen(head);
    	if(len==0 || k==0) {
        	return head;
        }
        k = k%len;
        ListNode fast = head;
        while(k!=0) {
        	fast = fast.next;
        	k-=1;
        }
        ListNode ptr1 = head;
        while(fast.next!=null) {
        	ptr1 = ptr1.next;
        	fast = fast.next;
        }
        fast.next = head;
        head = ptr1.next;
        ptr1.next = null;
        return head;
    }
    
    public static int getLen(ListNode head) {
    	int count = 0;
    	while (head!=null) {
    		count++;
    		head = head.next;
    	}
    	return count;
    }

}
