package problemSolvingJava;

public class CheckIfLinkedListIsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean isPalindrome(ListNode head) {
    	if(head.next==null) {
    		return true;
    	}
        ListNode mid = findMidPoint(head);
        mid = reverseFromNode(mid);
        ListNode ptr1 = head;
        // printLinkedList(mid);
        while(mid!=null) {
        	if(mid.val!=ptr1.val)
        		return false;
        	mid = mid.next;
        	ptr1 = ptr1.next;
        }
        return true;
    }
    
    private static void printLinkedList(ListNode list) {
		while(list!=null) {
			System.out.printf("%d ",list.val);
			list = list.next;
		}
		System.out.println();
	}
    
    private static ListNode findMidPoint(ListNode head) {
    	ListNode slow,fast;
    	slow=fast=head;
    	while(fast!=null && fast.next!=null) {
    		slow = slow.next;
    		fast = fast.next.next;
    	}
    	if(fast==null) {
    		return slow;
    	}
    	return slow.next;
    }
    
    private static ListNode reverseFromNode(ListNode head) {
    	if(head==null || head.next==null) {
    		return head;
    	}
    	ListNode temp = head.next;
    	head.next = null;
    	ListNode newHead = reverseFromNode(temp);
    	temp.next = head;
    	return newHead;
    }

}
