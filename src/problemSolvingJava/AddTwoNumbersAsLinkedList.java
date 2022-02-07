package problemSolvingJava;

public class AddTwoNumbersAsLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=null,end=null;
        int carry=0,sum=0;
        while(l1!=null || l2!=null) {
        	if(l1!=null && l2!=null) {
        		sum = l1.val+l2.val+carry;
        		l1 = l1.next;
        		l2 = l2.next;
        	}
        	else if(l1!=null) {
        		sum = l1.val+carry;
        		l1 = l1.next;
        	}
        	else {
        		sum = l2.val+carry;
        		l2 = l2.next;
        	}
        	if(head==null) {
        		head = new ListNode(sum%10);
        		end = head;
        	}
        	else {
        		end.next = new ListNode(sum%10);
        		end = end.next;
        	}
        	carry = sum/10;
        }
        if(carry>0) {
        	end.next = new ListNode(carry);
        }
        return head;
    }

}
