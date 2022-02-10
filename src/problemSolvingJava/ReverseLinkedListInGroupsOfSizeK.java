package problemSolvingJava;

public class ReverseLinkedListInGroupsOfSizeK {

	public static void main(String[] args) {
		System.out.println("Hi");

	}
	
    public ListNode reverseKGroup(ListNode head, int k) {
    	if(head==null || head.next==null || k==1) {
    		return head;
    	}
    	int len = getLen(head);
    	int reverseCount = len/k;
    	head = reverseInGroup(head, reverseCount, k, k);
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
    
    public static ListNode reverseInGroup(ListNode head, int rvCount, int flag, int k) {
    	if(rvCount==0) {
    		return head;
    	}
    	if(flag==1) {
    		ListNode newHead = reverseInGroup(head.next, rvCount-1, k, k);
    		head.next = newHead;
    		return head;
    	}
        ListNode temp = head.next;
    	ListNode newHead = reverseInGroup(temp, rvCount, flag-1, k);
    	head.next = temp.next;
    	temp.next = head;
    	return newHead;
    }

}
