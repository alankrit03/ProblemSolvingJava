package problemSolvingJava;

//Definition for ListNode.

//class ListNode {
//	int val;
//	ListNode next;
//	
//	ListNode(){}
//	
//	ListNode(int val) { 
//		this.val = val; 
//	}
//	
//	ListNode(int val, ListNode next){
//		this.val = val; 
//		this.next = next; 
//	} 
//}

public class FindTheMiddleOfLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public ListNode middleNode(ListNode head) {
        if(head==null || head.next==null) {
        	return head;
        }
        ListNode fast,slow;
        fast = slow = head;
        while(fast!=null && fast.next!=null) {
        	slow = slow.next;
        	fast = fast.next.next;
        }
        return slow;
    }

}
