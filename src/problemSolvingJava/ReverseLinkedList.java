package problemSolvingJava;


//Definition for ListNode.

class ListNode {
	int val;
	ListNode next;
	
	ListNode(){}
	
	ListNode(int val) { 
		this.val = val; 
	}
	
	ListNode(int val, ListNode next){
		this.val = val; 
		this.next = next; 
	} 
}



public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next == null) {
        	return head;
        }
    	ListNode temp = head.next;
        head.next = null;
        ListNode newHead = reverseList(temp);
        temp.next = head;
        return newHead;
    }

}
